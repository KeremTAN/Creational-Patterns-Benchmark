package CustomerPackage;

public class StandartCustomer extends ACustomer{
    public StandartCustomer(String firstName, String lastName, String tcId, String phoneNumber, char gender) {
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.setFirstName(firstName);
        super.setLastName(lastName);
        super.setTcId(tcId);
        super.setPhoneNumber(phoneNumber);
        super.setGender(gender);
    }
}
