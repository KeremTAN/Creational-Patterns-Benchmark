package SimpleFactoryPattern;

public class CustomerSimpleFactory {
    public CustomerSF createCustomer(int CustonerID, String firstName, String lastName, String tcId, String phoneNumber, char gender){
        if(CustonerID == 1){
            return new CustomerSF(firstName, lastName, tcId, phoneNumber, gender);
        }
        else {
            return new CustomerSF(firstName, lastName, tcId, phoneNumber, true, false, gender);
        }

    }



}
