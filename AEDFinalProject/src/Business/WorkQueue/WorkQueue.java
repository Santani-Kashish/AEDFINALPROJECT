/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author kashish
 */
public class WorkQueue {
    
    private ArrayList<Request> workRequestList;
   

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<Request> getWorkRequestList() {
        return workRequestList;
    }
}
