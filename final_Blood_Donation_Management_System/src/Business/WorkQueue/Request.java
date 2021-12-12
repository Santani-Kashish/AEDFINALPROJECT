/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


import java.util.Date;
import Business.Account.MainAcc;

/**
 * This class is used to create a work request for the system.
 */
public abstract class Request {

    private String requestId;
    private String requestType;
    private String requestStatus;

    private Date requestDate;
    private Date resolveDate;

    private MainAcc sender;
    private MainAcc receiver;
    private String comments;


    private String message;

    private String result;

    private String status;


    private String senderMail;

    private String receiverMail;

    private String senderName;

    private String receiverName;

    private String senderPhone;
    private String fileDn;
    private String Org;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }


    public String getSenderMail() {
        return senderMail;
    }

    public void setSenderMail(String senderMail) {
        this.senderMail = senderMail;
    }

    public String getReceiverMail() {
        return receiverMail;
    }

    public void setReceiverMail(String receiverMail) {
        this.receiverMail = receiverMail;
    }


     private String patientBloodGroup;

    public String getPatientBloodGroup() {
        return patientBloodGroup;
    }

    public void setPatientBloodGroup(String patientBloodGroup) {
        this.patientBloodGroup = patientBloodGroup;
    }
    
    public String getOrg() {
        return Org;
    }

    public void setOrg(String org) {
        this.Org = org;
    }
    
    public Request(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }
    
    
    public String getFileDn() {
        return fileDn;
    }

    public void setFileDn(String fileDn) {
        this.fileDn = fileDn;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }

    public MainAcc getSender() {
        return sender;
    }

    public void setSender(MainAcc sender) {
        this.sender = sender;
    }

    public MainAcc getReceiver() {
        return receiver;
    }

    public void setReceiver(MainAcc receiver) {
        this.receiver = receiver;
    }

    

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    @Override
    public String toString(){
        return this.message;
    }
}
