package CustomerPackage;

public class ACustomer implements Cloneable {
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

    public ACustomer clone(int x) throws CloneNotSupportedException {
        ACustomer c = null;
        try {
            c = (ACustomer) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        c.setFirstName("Unknown");
        c.setLastName("Unknown");
        c.setTcId("Unknown");
        c.setPhoneNumber("Unknown");
        if(x==1){
            c.isMarried=true;
            c.hasCriminalRecord=false;
        }
        return c;
    }
    /**
     *
     * GETTERS & SETTERS
     *
     */

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTcId() {
        return tcId;
    }

    public void setTcId(String tcId) {
        this.tcId = tcId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(double creditScore) {
        this.creditScore = creditScore;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public boolean hasCriminalRecord() {
        return hasCriminalRecord;
    }

    public void setHasCriminalRecord(boolean hasCriminalRecord) {
        this.hasCriminalRecord = hasCriminalRecord;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
