package AbstractFactoryPattern;

import CustomerPackage.ACustomer;
import CustomerPackage.GreatCustomer;

public class GreatCustomerFactory implements ICustomerFactory {
    @Override
    public ACustomer creatCustomer(String firstName, String lastName, String tcId, String phoneNumber, char gender) {
        return new GreatCustomer(firstName, lastName, tcId, phoneNumber,  gender);
    }
}
