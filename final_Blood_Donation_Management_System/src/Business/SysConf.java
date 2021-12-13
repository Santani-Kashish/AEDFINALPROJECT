package Business;

import Business.Account.MainAcc;
import Business.Employee.PersonEntity;
import Business.Role.adminMain;

/**
 * This class configures a system with the given parameters.
 */
public class SysConf {
    
    public static Environment configure(){
        
        Environment var = Environment.getObj();

        PersonEntity data = var.getEmpDetails().addData("SYS", 1);

        MainAcc ua = var.getData().createAccount("adminmain", "adminmain", data, new adminMain());

        return var;


    }
    
}
