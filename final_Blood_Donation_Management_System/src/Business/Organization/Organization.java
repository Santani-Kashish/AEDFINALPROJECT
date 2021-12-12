/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.PersonRepository;
import Business.Role.Title;
import Business.Account.Repository;
import Business.Person.DonorDirectory;
import Business.Person.PatientDirectory;
import Business.Person.RecipientDirectory;
import Business.Person.VisitorDirectory;

import java.util.ArrayList;

/**
 *
 * @author TEJAL
 */
public abstract class Organization {

    private String name;
    private PersonRepository employeeDirectory;
    private Repository accountDirectory;
    public abstract ArrayList<Title> getTitle();
    private DonorDirectory donorDirectory;
    private RecipientDirectory recipientDirectory;
    private PatientDirectory patientDirectory;

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    private VisitorDirectory vd;
    private int organizationID;
    private static int counter = 1;

    public Repository getAccountDirectory() {
        return accountDirectory;
    }

    public void setAccountDirectory(Repository accountDirectory) {
        this.accountDirectory = accountDirectory;
    }

    public VisitorDirectory getVd() {
        return vd;
    }

    public void setVd(VisitorDirectory vd) {
        this.vd = vd;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organization.counter = counter;
    }
    
    public enum Type{
        Doctor("Doctor Organization "),PublicityTeamAdmin("PublicityTeam Admin Organization"),
        Reception("Reception Organization"),CommitteeAdmin("CommitteeAdmin"),PlasmaBankAdmin("Plasma Bank Admin"), Delivery("Transportation Admin"), Person("DeliveryMan");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
       
        this.employeeDirectory = new PersonRepository();
        this.accountDirectory = new Repository();
        this.donorDirectory = new DonorDirectory();
        this.recipientDirectory = new RecipientDirectory();
        this.organizationID = counter;
        this.patientDirectory = new PatientDirectory();
        ++counter;
    }
    
    public Repository getData() {
        return accountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public PersonRepository getEmpDetails() {
        return employeeDirectory;
    }
    
    public DonorDirectory getDonorDirectory() {
        return donorDirectory;
    }
    
    public RecipientDirectory getRecipientDirectory(){
        return recipientDirectory;
    }
    
    public String getName() {
        return name;
    }

   

    public void setName(String name) {
        this.name = name;
    }

    

    @Override
    public String toString() {
        return name;
    }
    
    
}

