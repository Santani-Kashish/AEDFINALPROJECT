package Business.DB4OUtil;

import Business.SysConf;
import Business.Environment;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

/**
 * This class is used to configure the database.
 */
public class DbInstance {

    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();// path to the data store
    private static DbInstance dbInstance;
    
    public synchronized static DbInstance getInstance(){
        if (dbInstance == null){
            dbInstance = new DbInstance();
        }
        return dbInstance;
    }


    private ObjectContainer db;

    private DbInstance(){
        //Initialize the database
//        this.initializeDB();
    }

    public ObjectContainer getDB(){
        return db;
    }

    public void initializeDB(){
        EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
        config.common().add(new TransparentPersistenceSupport());
        config.common().objectClass(Environment.class).cascadeOnUpdate(true);
        config.common().objectClass(SysConf.class).cascadeOnUpdate(true);
        db = Db4oEmbedded.openFile(config, FILENAME);
    }

    public void commit(){
        db.commit();
    }

    public void close(){
        db.close();
    }

    public ObjectSet query(Class clazz){
        return db.query(clazz);
    }

    public ObjectSet query(Class clazz, Object obj){
        return db.queryByExample(obj);
    }

    public void store(Object obj){
        db.store(obj);
    }

    public void delete(Object obj){
        db.delete(obj);
    }

    public Object getObjectById(Class clazz, int id){
        Object obj = db.query(clazz).get(id);
        return obj;
    }

    public void update(Object obj){
        db.store(obj);
    }




    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(Environment.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(Environment system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }
    
    public Environment retrieveSystem(){
        ObjectContainer conn = createConnection();
        ObjectSet<Environment> systems = conn.query(Environment.class); // Change to the object you want to save
        Environment system;
        if (systems.size() == 0){
            system = SysConf.configure();  // If there's no System in the record, create a new one
        }
        else{
            system = systems.get(systems.size() - 1);
        }
        conn.close();
        return system;
    }
}
