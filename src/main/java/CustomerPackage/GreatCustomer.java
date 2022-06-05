package CustomerPackage;

public class GreatCustomer extends ACustomer{
    public GreatCustomer(String firstName, String lastName, String tcId, String phoneNumber, char gender) {
        super.setFirstName(firstName);
        super.setLastName(lastName);
        super.setTcId(tcId);
        super.setPhoneNumber(phoneNumber);
        super.setGender(gender);
        super.setIsMarried(true);
        super.setHasCriminalRecord(true);
    }
}
