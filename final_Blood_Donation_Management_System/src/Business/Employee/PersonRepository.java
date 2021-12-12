/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 * This class is used to store all the employees in the system.
 */
public class PersonRepository {
    private ArrayList<PersonEntity> personEntityList;

    public PersonRepository() {
        personEntityList = new ArrayList();
    }


    private PersonEntity searchEmployee2(String name) {
        for (PersonEntity personEntity : personEntityList) {
            if (personEntity.getName().equals(name)) {
                return personEntity;
            }
        }
        return null;
    }



    public ArrayList<PersonEntity> ListPeople() {
        return personEntityList;
    }
    
    public PersonEntity addData(String name, int id){
        PersonEntity personEntity = new PersonEntity();
        personEntity.setName(name);
//        personEntity.setId(id);
        personEntityList.add(personEntity);
        return personEntity;
    }

    public void deletePerson(PersonEntity personEntity){
        personEntityList.remove(personEntity);
    }

    public PersonEntity searchEmployee(String name){
        for (PersonEntity personEntity : personEntityList) {
            if (personEntity.getName().equals(name)) {
                return personEntity;
            }
        }
        return null;
    }

    public PersonEntity searchEmployee(int id){
        for (PersonEntity personEntity : personEntityList) {
            if (personEntity.getId() == id) {
                return personEntity;
            }
        }
        return null;
    }


}
