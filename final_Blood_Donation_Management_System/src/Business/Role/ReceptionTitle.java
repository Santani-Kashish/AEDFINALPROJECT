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

import userInterface.reception.PatientRegistrationForm;

/**
 *
 * @author patol
 */
public class ReceptionTitle extends Title {
    @Override
    public JPanel createPanel(JPanel rightPanel, MainAcc mainAcc, Organization organization, Enterprise enterprise, Environment business) {
        return new PatientRegistrationForm(rightPanel,organization);
    }

    @Override
    public RoleType getValue() {
        return RoleType.valueOf(this.getClass().getSimpleName());
    }
}

