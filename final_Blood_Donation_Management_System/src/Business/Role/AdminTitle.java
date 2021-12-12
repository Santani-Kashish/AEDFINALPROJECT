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
import userInterface.clinicadmin.HospitalAdminWorkArea;

/**
 *
 * @author srikar
 */
public class AdminTitle extends Title {

    @Override
    public JPanel createPanel(JPanel userProcessContainer, MainAcc mainAcc, Organization organization, Enterprise enterprise, Environment business) {
        return new HospitalAdminWorkArea(userProcessContainer, enterprise);
    }

    @Override
    public RoleType getValue() {
        return null;
    }
}

