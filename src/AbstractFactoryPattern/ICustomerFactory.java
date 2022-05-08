package AbstractFactoryPattern;

public interface ICustomerFactory {
    CustomerAF creatCustomer(String firstName, String lastName, String tcId, String phoneNumber, char gender);
}
