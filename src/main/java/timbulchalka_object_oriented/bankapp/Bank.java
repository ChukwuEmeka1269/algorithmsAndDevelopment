package timbulchalka_object_oriented.bankapp;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private ArrayList<Branch> listOfBranches;

    public Bank() {
    }

    public Bank(String bankName) {
        this.bankName = bankName;
        this.listOfBranches = new ArrayList<>();
    }

    public void addListOfBranches(List<Branch> branches){
        this.listOfBranches.addAll(branches);
    }

    public static Bank createBank(String bankName){
        return new Bank(bankName);
    }

    public Double singleCustomerTransaction(String branchName, String customerName, double amount, String transaction){
        Double transact = 0.0;
        for (Branch listOfBranch : this.listOfBranches) {
            if (branchName.equalsIgnoreCase(listOfBranch.getBranchName())) {
                for (Customer customer : listOfBranch.getListOfCustomers()) {
                    if (customer.getCustomerName().equalsIgnoreCase(customerName)) {
                        transact = customer.transact(transaction, amount);
                    }
                }
            }
        }
//        System.out.println(customerName+"'s balance is = " + transact );
        return transact;
    }

    public Branch addNewBranch(String branchName){
        Branch branch = Branch.createBranch(branchName);
        int index = this.listOfBranches.indexOf(branch);
        if(index >= 0){
            System.out.println("Branch already exist.");
            return null;
        }else{
            this.listOfBranches.add(branch);
            return branch;
        }
    }

    public void addCustomerToBranch(String customerName, String branchName, double initialDeposit){
        for (Branch listOfBranch : this.listOfBranches) {
            if (listOfBranch.getBranchName().equalsIgnoreCase(branchName)) {
                listOfBranch.addCustomer(customerName, initialDeposit);
            }
        }
    }

    public void printCustomerListOfABranch(String branchName){
        for(Branch branch : this.listOfBranches){
            branch.printListOfCustomers(branchName);
        }
    }

    public void printListOfBranches(){
        System.out.println("There are " + this.listOfBranches.size() + " branches listed below: ");
        for(int i=0 ;  i<this.listOfBranches.size(); i++){
            System.out.println((i+1) + ". " +this.listOfBranches.get(i).getBranchName());
        }
    }

    public String getBankName() {
        return bankName;
    }

    public ArrayList<Branch> getListOfBranches() {
        return listOfBranches;
    }
}
