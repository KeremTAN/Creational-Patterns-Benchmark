package AbstractFactoryPattern;
import CustomerPackage.ACustomer;

public interface ICustomerFactory {
    ACustomer creatCustomer(String firstName, String lastName, String tcId, String phoneNumber, char gender);
}
