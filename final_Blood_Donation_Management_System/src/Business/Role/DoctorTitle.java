/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Account.MainAcc;
import Business.Environment;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import javax.swing.JPanel;
import userInterface.DoctorWorkArea.PatientTestRequestJPanel;

/**
 *
 * @author srikar
 */
public class DoctorTitle extends Title {
    @Override
    public JPanel createPanel(JPanel rightPanel, MainAcc mainAcc, Organization organization, Enterprise enterprise, Environment business) {
        return new PatientTestRequestJPanel(rightPanel, enterprise, mainAcc, business);
    }

    @Override
    public RoleType getValue() {
        return null;
    }
}
