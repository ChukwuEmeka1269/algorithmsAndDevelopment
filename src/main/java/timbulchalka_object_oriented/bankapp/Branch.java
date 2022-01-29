package timbulchalka_object_oriented.bankapp;

import java.util.ArrayList;


public class Branch {
    private String branchName;
    private ArrayList<Customer> listOfCustomers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.listOfCustomers = new ArrayList<>();
    }

    public ArrayList<Customer> getListOfCustomers() {
        return listOfCustomers;
    }

    public static Branch createBranch(String branchName){
        return new Branch(branchName);
    }

    public void printListOfCustomers(String branchName){
        if(this.branchName.equalsIgnoreCase(branchName)) {
            for (int i = 0; i < this.listOfCustomers.size(); i++) {
                System.out.println((i + 1) +". " +this.listOfCustomers.get(i).getCustomerName());
            }
        }
    }

    public boolean addCustomer(String customerName, Double initialDeposit){
        Customer customer = Customer.createCustomer(customerName);
        String initialTransaction = "deposit";
        int index = listOfCustomers.indexOf(customer);
        if(index >= 0){
            System.out.println("Customer already have an account here.");
            return false;
        } else {
            this.listOfCustomers.add(customer);
            customer.transact(initialTransaction, initialDeposit);
            return true;
        }
    }



    public Double makeTransaction(String transaction, Customer customer, double amount){
        int index = listOfCustomers.indexOf(customer);
        if(index >= 0){
            return customer.transact(transaction, amount);
        }
        return null;
    }


    public String getBranchName() {
        return branchName;
    }
}
