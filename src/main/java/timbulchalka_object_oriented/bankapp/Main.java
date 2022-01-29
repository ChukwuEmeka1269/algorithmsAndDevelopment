package timbulchalka_object_oriented.bankapp;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bank wema = Bank.createBank("Wema");
        Branch ajah = new Branch("Ajah");
        Branch sangotedo = new Branch("Sangotedo");
        Branch egbeda = new Branch("Egbeda");
        Branch victoria_island = new Branch("Victoria Island");
        List<Branch> branches = List.of(
                victoria_island,
                egbeda,
                sangotedo,
                ajah
        );
        wema.addListOfBranches(branches);
        wema.printListOfBranches();

        wema.addCustomerToBranch("Ade", ajah.getBranchName(), 250.25);
        wema.addCustomerToBranch("Ibe", ajah.getBranchName(), 450.25);
        wema.addCustomerToBranch("Tade", ajah.getBranchName(), 260.25);
        wema.addCustomerToBranch("Luke", ajah.getBranchName(), 550.25);

        wema.printCustomerListOfABranch(ajah.getBranchName());

        Double customerTransaction = wema.singleCustomerTransaction(ajah.getBranchName(), "Ade", 50.0, "Withdrawal");
        System.out.println("Customer transaction balance = "+ customerTransaction );

    }


}
