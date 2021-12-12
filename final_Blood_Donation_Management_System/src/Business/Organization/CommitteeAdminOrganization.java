/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CommitteeAdminTitle;
import Business.Role.Title;

import java.util.ArrayList;

/**
 *
 * @author patol
 */
public class CommitteeAdminOrganization  extends Organization{

    public CommitteeAdminOrganization() {
        super(Organization.Type.CommitteeAdmin.getValue());
    }
    
    @Override
    public ArrayList<Title> getTitle() {
        ArrayList<Title> titles = new ArrayList();
        titles.add(new CommitteeAdminTitle());
        return titles;
    }
     
}
