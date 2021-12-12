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

import javax.management.relation.Role;
import javax.swing.JPanel;

import userInterface.bloodbank.ManagePlasmaJPanel;

/**
 *
 * @author patol
 */
public class PlasmaTitle extends Title {


      @Override
    public JPanel createPanel(JPanel rightPanel, MainAcc mainAcc, Organization organization, Enterprise enterprise, Environment business) {
        return new ManagePlasmaJPanel(rightPanel, mainAcc,organization,enterprise,business);
    }

    @Override
    public String toString(){
        return "Plasma";
    }



  @Override
  public RoleType getValue() {
    return null;
  }
}
