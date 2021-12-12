package Business.Person;

import java.util.List;

public class Donor2 extends Person {

    private String bloodGroup;
    private String bloodType;
    private String rhFactor;
    private String donorId;
    private String donorName;
    private String donorAge;
    private String donorGender;
    private String donorPhone;
    private String donorEmail;
    private String donorAddress;
    private String donorCity;
    private String donorState;
    private String donorZip;
    private String donorCountry;
    private String donorWeight;
    private String donorHeight;
    private String donorDOB;
  private String pocName;
  private String pocContact;
  private boolean isOrganAvaiNow;
  List<String> organs;



    public Donor2() {
        super();
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }

    public String getDonorId() {
        return donorId;
    }

    public void setDonorId(String donorId) {
        this.donorId = donorId;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public String getDonorAge() {
        return donorAge;
    }

    public void setDonorAge(String donorAge) {
        this.donorAge = donorAge;
    }

    public String getDonorGender() {
        return donorGender;
    }

    public void setDonorGender(String donorGender) {
        this.donorGender = donorGender;
    }

    public String getDonorPhone() {
        return donorPhone;
    }

    public void setDonorPhone(String donorPhone) {
        this.donorPhone = donorPhone;
    }

    public String getDonorEmail() {
        return donorEmail;
    }

    public void setDonorEmail(String donorEmail) {
        this.donorEmail = donorEmail;
    }

    public String getDonorAddress() {
        return donorAddress;
    }

    public void setDonorAddress(String donorAddress) {
        this.donorAddress = donorAddress;
    }

    public String getDonorCity() {
        return donorCity;
    }

    public void setDonorCity(String donorCity) {
        this.donorCity = donorCity;
    }

    public String getDonorState() {
        return donorState;
    }

    public void setDonorState(String donorState) {
        this.donorState = donorState;
    }

    public String getDonorZip() {
        return donorZip;
    }

    public void setDonorZip(String donorZip) {
        this.donorZip = donorZip;
    }

    public String getDonorCountry() {
        return donorCountry;
    }

    public void setDonorCountry(String donorCountry) {
        this.donorCountry = donorCountry;
    }

    public String getDonorWeight() {
        return donorWeight;
    }

    public void setDonorWeight(String donorWeight) {
        this.donorWeight = donorWeight;
    }

    public String getDonorHeight() {
        return donorHeight;
    }

    public void setDonorHeight(String donorHeight) {
        this.donorHeight = donorHeight;
    }

    public String getDonorDOB() {
        return donorDOB;
    }


    public void setDonorDOB(String donorDOB) {
        this.donorDOB = donorDOB;
    }

    @Override
    public String toString() {
        return this.getDonorName();
    }


}
