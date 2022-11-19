
public class Main {

    public static void main(String args[]) {

        TireManager tm = new TireManager();

        while(tm.stillCustomers()) {
            tm.serveNextCustomer();
        }

    }

}
