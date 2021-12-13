/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author kashish
 */
public class LabTestWorkRequest extends Request {
    
    
    
    public String getPatientName() {
        return patientName;
    }

   
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    private String patientName;

 
}
