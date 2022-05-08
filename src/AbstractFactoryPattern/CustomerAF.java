package AbstractFactoryPattern;

public class CustomerAF {
    private String firstName="Unknown";
    private String lastName="Unknown";
    private String address="Unknown";
    private String emailAddress="Unknown";
    private String tcId="Unknown";
    private String phoneNumber="Unknown";

    private int age=0;

    private double creditScore=0.0;

    private boolean isMarried=false;
    private boolean hasCriminalRecord=false;

    private char gender='X';


    public CustomerAF(String firstName, String lastName, String tcId, String phoneNumber, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tcId = tcId;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public CustomerAF(String firstName, String lastName, String tcId, String phoneNumber, boolean isMarried, boolean hasCriminalRecord, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tcId = tcId;
        this.phoneNumber = phoneNumber;
        this.isMarried = isMarried;
        this.hasCriminalRecord = hasCriminalRecord;
        this.gender = gender;
    }

    /**
     *
     * GETTERS & SETTERS
     *
     */

    protected String getFirstName() {
        return firstName;
    }

    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    protected String getLastName() {
        return lastName;
    }

    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }

    protected String getAddress() {
        return address;
    }

    protected void setAddress(String address) {
        this.address = address;
    }

    protected String getEmailAddress() {
        return emailAddress;
    }

    protected void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    protected String getTcId() {
        return tcId;
    }

    protected void setTcId(String tcId) {
        this.tcId = tcId;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected String getPhoneNumber() {
        return phoneNumber;
    }

    protected void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    protected double getCreditScore() {
        return creditScore;
    }

    protected void setCreditScore(double creditScore) {
        this.creditScore = creditScore;
    }

    protected boolean isMarried() {
        return isMarried;
    }

    protected void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    protected boolean hasCriminalRecord() {
        return hasCriminalRecord;
    }

    protected void setHasCriminalRecord(boolean hasCriminalRecord) {
        this.hasCriminalRecord = hasCriminalRecord;
    }

    protected char getGender() {
        return gender;
    }

    protected void setGender(char gender) {
        this.gender = gender;
    }
}
