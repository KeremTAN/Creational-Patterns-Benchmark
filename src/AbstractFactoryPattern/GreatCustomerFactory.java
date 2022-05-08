package AbstractFactoryPattern;

public class GreatCustomerFactory implements ICustomerFactory {
    @Override
    public CustomerAF creatCustomer(String firstName, String lastName, String tcId, String phoneNumber, char gender) {
        return new CustomerAF(firstName, lastName, tcId, phoneNumber, true, false, gender);
    }
}
