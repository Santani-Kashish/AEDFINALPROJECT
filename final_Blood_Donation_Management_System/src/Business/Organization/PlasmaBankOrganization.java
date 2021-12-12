/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.PlasmaTitle;
import Business.Role.Title;
import java.util.ArrayList;

/**
 *
 * @author patol
 */
public class PlasmaBankOrganization extends Organization{

    public PlasmaBankOrganization() {
        super(Organization.Type.PlasmaBankAdmin.getValue());
    }
    
    @Override
    public ArrayList<Title> getTitle() {
        ArrayList<Title> titles = new ArrayList();
        titles.add(new PlasmaTitle());
        return titles;
    }
     
} 
