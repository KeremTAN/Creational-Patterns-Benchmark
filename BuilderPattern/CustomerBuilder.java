package BuilderPattern;

import CustomerPackage.ACustomer;
import CustomerPackage.EmptyCustomer;

public class CustomerBuilder {
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


    public static CustomerBuilder createCustomer(String firstName, String lastName, String tcId, String phoneNumber, char gender){
        CustomerBuilder builder = new CustomerBuilder();
        builder.firstName=firstName;
        builder.lastName=lastName;
        builder.tcId=tcId;
        builder.phoneNumber=phoneNumber;
        builder.gender=gender;

        return builder;
    }
    public static CustomerBuilder createGreatCustomer(String firstName, String lastName, String tcId, String phoneNumber, char gender){
        CustomerBuilder builder = new CustomerBuilder();
        builder.firstName=firstName;
        builder.lastName=lastName;
        builder.tcId=tcId;
        builder.phoneNumber=phoneNumber;
        builder.gender=gender;

        builder.isMarried=true;
        builder.hasCriminalRecord=false;
        return builder;
    }

    public ACustomer buildCustomer(){
        ACustomer customer = new EmptyCustomer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setAddress(address);
        customer.setEmailAddress(emailAddress);
        customer.setTcId(tcId);
        customer.setAge(age);
        customer.setPhoneNumber(phoneNumber);
        customer.setCreditScore(creditScore);
        customer.setIsMarried(isMarried);
        customer.setHasCriminalRecord(hasCriminalRecord);
        customer.setGender(gender);

        return customer;
    }

    public CustomerBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public CustomerBuilder setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public CustomerBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public CustomerBuilder setCreditScore(double creditScore) {
        this.creditScore = creditScore;
        return this;
    }

    public CustomerBuilder setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
        return this;
    }

    public CustomerBuilder setHasCriminalRecord(boolean hasCriminalRecord) {
        this.hasCriminalRecord = hasCriminalRecord;
        return this;
    }

}
