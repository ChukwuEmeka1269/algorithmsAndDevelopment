package timbulchalka_object_oriented.bankapp.challenge;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double> transactions;

    public Customer(String customerName, double initialDeposit) {
        this.customerName = customerName;
        this.transactions = new ArrayList<>();
        addCustomerTransaction(initialDeposit);
    }

    public void addCustomerTransaction(double amount) {
        this.transactions.add(amount);
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
