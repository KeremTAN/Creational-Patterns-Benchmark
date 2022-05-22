package SimpleFactoryPattern;
import CustomerPackage.ACustomer;
import CustomerPackage.GreatCustomer;
import CustomerPackage.StandartCustomer;

public class CustomerSimpleFactory {
    public ACustomer createCustomer(int CustonerID, String firstName, String lastName, String tcId, String phoneNumber, char gender){
        if(CustonerID == 1){
            return new StandartCustomer(firstName, lastName, tcId, phoneNumber, gender);
        }
        else {
            return new GreatCustomer(firstName, lastName, tcId, phoneNumber,  gender);
        }

    }



}
