/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AwarenessTitle;
import Business.Role.Title;

import java.util.ArrayList;

/**
 *
 * @author kashish
 */
public class PublicityTeamOrganization extends Organization{

    public PublicityTeamOrganization() {
        super(Organization.Type.PublicityTeamAdmin.getValue());
    }
    
    @Override
    public ArrayList<Title> getTitle() {
        ArrayList<Title> titles = new ArrayList();
        titles.add(new AwarenessTitle());
        return titles;
    }
}
     
