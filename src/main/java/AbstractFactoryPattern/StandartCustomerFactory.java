package AbstractFactoryPattern;

import CustomerPackage.ACustomer;
import CustomerPackage.StandartCustomer;

public class StandartCustomerFactory implements ICustomerFactory {
    @Override
    public ACustomer creatCustomer(String firstName, String lastName, String tcId, String phoneNumber, char gender) {
        return new StandartCustomer(firstName, lastName, tcId, phoneNumber, gender);
    }
}
