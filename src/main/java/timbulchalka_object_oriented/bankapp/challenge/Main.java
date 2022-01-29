package timbulchalka_object_oriented.bankapp.challenge;

public class Main {
    public static void main(String[] args) {
        Bank wema = new Bank("wema");
        wema.addBranch("Victoria Island");
        wema.addCustomer("Victoria Island", "Ben", 300.0);
        wema.addCustomer("Victoria Island", "Frank", 250.0);
        wema.addCustomer("Victoria Island", "Will", 290.0);
        wema.addCustomerTransaction("Victoria Island", "Ben", 250);

        wema.listCustomers("Victoria Island", true);

    }
}
