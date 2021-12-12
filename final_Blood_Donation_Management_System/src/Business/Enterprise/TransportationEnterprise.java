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
 * @author drrane
 */
public class TransportationEnterprise extends Enterprise {

    public TransportationEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Transportation);
    }
    @Override
    public ArrayList<Title> getTitle() {
        return null;
    }
   
}