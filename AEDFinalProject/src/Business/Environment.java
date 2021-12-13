/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Person.AwarenessEvent;
import Business.Role.Title;
import Business.Role.adminMain;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author kashish
 */
public class Environment extends Organization{
    
    private static Environment business;
    private ArrayList<Network> networkList;
    private ArrayList<AwarenessEvent> eventList;
    private WorkQueue workQueue;
    
    public static Environment getObj(){
        if(business==null){
            business=new Environment();
        }
        return business;
    }

    public ArrayList<AwarenessEvent> getEventList() {
        return eventList;
    }

    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    public AwarenessEvent createEvent(){
    
        AwarenessEvent event = new AwarenessEvent();
        eventList.add(event);
        return event;
    } 
    
    public ArrayList<Title> getTitle() {
        ArrayList<Title> titleList =new ArrayList<Title>();
        titleList.add(new adminMain());
        return titleList;
    }
    private Environment(){
        super(null);
        networkList=new ArrayList<Network>();
        eventList = new ArrayList<AwarenessEvent>();
        this.workQueue = new WorkQueue();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        return true;
    }
    
     public WorkQueue getWorkQueue() {
        return workQueue;
    }
     
     public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
}
