/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Environment;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Account.MainAcc;
import javax.swing.JPanel;

/**
 *
 * @author manita
*/
public abstract class Title {


    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant"),
        Government("Government Official"),
        Donor("Donor"),
        Recipient("Recipient"),
        DonorAdmin("Donor Admin"),
        RecipientAdmin("Recipient Admin");



        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }


    
    public abstract JPanel createPanel(JPanel userProcessContainer,
                                       MainAcc mainAcc,
                                       Organization organization,
                                       Enterprise enterprise,
                                       Environment business);


    public String toString(){
        return this.getClass().getName();
    }

    public abstract RoleType getValue() ;


//    @Override
//    public String toString() {
//        return this.getClass().getName().substring(14);
//    }
    
    
}