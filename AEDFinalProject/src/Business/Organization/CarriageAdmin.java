/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Title;
import Business.Role.DeliveryTitle;
import java.util.ArrayList;


/**
 *  This class is used to create a new transportation admin organization/
 */
public class CarriageAdmin extends Organization{

    public CarriageAdmin() {
        super(Organization.Type.Delivery.getValue());
    }


    private ArrayList<Title> getSupportedRole() {
        ArrayList<Title> titles = new ArrayList();
        titles.add(new DeliveryTitle());
        return titles;
    }

    @Override
    public ArrayList<Title> getTitle() {
        ArrayList<Title> titles = new ArrayList();
        titles.add(new DeliveryTitle());
        return titles;
    }
    
}
     