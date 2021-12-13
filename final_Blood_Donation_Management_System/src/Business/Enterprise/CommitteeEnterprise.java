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
 * @author manita
 */
public class CommitteeEnterprise extends Enterprise{

    public CommitteeEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Committee);
    }
    
    @Override
    public ArrayList<Title> getTitle() {
        return null;
    }
}
