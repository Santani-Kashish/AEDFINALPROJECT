/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ReceptionTitle;
import Business.Role.Title;

import java.util.ArrayList;

/**
 *
 * @author drrane
 */
public class ReceptionOrganization extends Organization{

    public ReceptionOrganization() {
        super(Organization.Type.Reception.getValue());
    }
    
    @Override
    public ArrayList<Title> getTitle() {
        ArrayList<Title> titles = new ArrayList();
        titles.add(new ReceptionTitle());
        return titles;
    }
     
}