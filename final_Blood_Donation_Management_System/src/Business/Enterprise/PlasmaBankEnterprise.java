/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Title;
import java.util.ArrayList;

/**
 *
 * @author sreshtha
 */
public abstract class PlasmaBankEnterprise extends Enterprise{

    public PlasmaBankEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.PlasmaBank);
    }
     
    @Override
    public ArrayList<Title> getTitle() {
        return null;
    }
}

