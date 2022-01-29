package timbulchalka_object_oriented.bankapp.challenge;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<>();
    }

    public boolean newCustomer(String customerName, double initialTransaction){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer == null){
            this.customers.add(new Customer(customerName, initialTransaction));
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addCustomerTransaction(amount);
            System.out.println("Transaction successful");
            return true;
        }

        System.out.println("Didn't find customer with name: "+ customerName);
        return false;
    }

    private Customer findCustomer(String customerName){
        for (Customer existingCustomer : customers) {
            if (customerName.equals(existingCustomer.getCustomerName())) {
                return existingCustomer;
            }
        }

        return null;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
