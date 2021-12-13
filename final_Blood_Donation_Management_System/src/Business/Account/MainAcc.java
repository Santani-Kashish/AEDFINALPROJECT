/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Account;
import Business.Employee.PersonEntity;
import Business.Role.Title;
import Business.WorkQueue.WorkQueue;

/**
 * This class represents the MainAcc of the system.
 */
public class MainAcc {
    private String username;
    private String password;
    private PersonEntity personEntity;
    private Title title;
    private WorkQueue workQueue;



    public MainAcc() {
        workQueue = new WorkQueue();
    }
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Title getRole() {
        return title;
    }

    public void setEmployee(PersonEntity personEntity) {
        this.personEntity = personEntity;
    }

    public void setRole(Title title) {
        this.title = title;
    }

    public PersonEntity getEmployee() {
        return personEntity;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    @Override
    public String toString() {
        return username;
    }

}
