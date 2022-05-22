package CustomerPackage;

public class EmptyCustomer extends ACustomer{
    public EmptyCustomer() {
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
