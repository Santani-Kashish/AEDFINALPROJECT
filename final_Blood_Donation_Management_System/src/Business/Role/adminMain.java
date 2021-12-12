/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Account.MainAcc;
import Business.Environment;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import userInterface.AdminWorkSpace.SystemAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author TEJAL 
*/
public class adminMain extends Title {
    @Override
    public JPanel createPanel(JPanel userProcessContainer, MainAcc mainAcc, Organization organization, Enterprise enterprise, Environment system) {
        return new SystemAdminWorkArea(userProcessContainer, system);
    }

    @Override
    public RoleType getValue() {
        return null;
    }

}
