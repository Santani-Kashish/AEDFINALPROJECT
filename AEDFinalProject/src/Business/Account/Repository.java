/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Account;

import java.util.ArrayList;
import Business.Employee.PersonEntity;
import Business.Role.Title;

/**
 * This class is used to store all the accounts.
 */
public class Repository {

  private ArrayList<MainAcc> mainAccList;


  public Repository() {
    mainAccList = new ArrayList();
  }

  public ArrayList<MainAcc> getUserAccountList() {
    return mainAccList;
  }

  public MainAcc authenticateUser(String username, String password) {
    for (MainAcc ua : mainAccList)
      if (ua.getUsername().equals(username) && ua.getPassword().equals(password)) {
        return ua;
      }
    return null;
  }

  public MainAcc authenticateUser(String username) {
    for (MainAcc ua : mainAccList)
      if (ua.getUsername().equals(username)) {
        return ua;
      }
    return null;
  }

//  public MainAcc authenticateUser(PersonEntity person) {
//    for (MainAcc ua : mainAccList)
//      if (ua.getPerson().equals(person)) {
//        return ua;
//      }
//    return null;
//  }



  public MainAcc createAccount(String username, String password, PersonEntity personEntity, Title title) {
    if (checkIfUsernameIsUnique(username)) {
      MainAcc mainAcc = new MainAcc();
      mainAcc.setUsername(username);
      mainAcc.setPassword(password);
      mainAcc.setEmployee(personEntity);
      mainAcc.setRole(title);
      mainAccList.add(mainAcc);
      return mainAcc;
    } else
      return null;
  }

  public boolean checkIfUsernameIsUnique(String username) {
    for (MainAcc ua : mainAccList) {
      if (ua.getUsername().equals(username))
        return false;
    }
    return true;
  }
}
