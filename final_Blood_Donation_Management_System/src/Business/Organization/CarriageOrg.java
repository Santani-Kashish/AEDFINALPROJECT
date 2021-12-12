/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DeliveryManTitle;
import Business.Role.Title;
import java.util.ArrayList;

/**
 * This class represents the organization of the delivery .
 */
public class CarriageOrg extends Organization{

    public CarriageOrg() {
        super(Organization.Type.Person.getValue());
    }
    


    @Override
    public String toString(){
        return "Carriage Organization";
    }

    @Override
    public ArrayList<Title> getTitle() {
        ArrayList<Title> roles = new ArrayList<>();
        roles.add(new DeliveryManTitle());
        return roles;
    }

    /**
     *
     * This method is used to get title of the delivery .
     * @return the type
     */
    public ArrayList<Title> getTitle1() {
        ArrayList<Title> roles = new ArrayList<>();
        roles.add(new DeliveryManTitle());
        return roles;
    }
     
}
