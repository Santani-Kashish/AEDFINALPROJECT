/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Title;
import java.util.ArrayList;

/**
 *
 * @author sreshtha
 */
public abstract class HospitalEnterprise extends Enterprise {

    public HospitalEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Hospital);
    }
    @Override
    public ArrayList<Title> getTitle() {
        return null;
    }
   
}
