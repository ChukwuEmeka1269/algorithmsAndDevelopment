package timbulchalka_object_oriented.bankapp;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double> transactions;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.transactions = new ArrayList<>();
    }

    public static Customer createCustomer(String customerName){
        return new Customer(customerName);
    }

    public Double deposit(double amount){
        return amount;
    }

    public Double withdraw(double amount){
        return -amount;
    }

    public Double transact(String transaction, double amount){
        Transaction transactionType = selection(transaction);
        switch (transactionType){
            case DEPOSIT:
                this.transactions.add(deposit(amount));
                System.out.println("successfully made a deposit of " + amount);
                return balance();
            case WITHDRAWAL:
                this.transactions.add(withdraw(amount));
                System.out.println("You have withdrawn "+ amount);
                return balance();
            default:
                return null;
        }
    }

    public Double balance(){
        double sum = 0;
        for (Double transaction : transactions) {
            sum += transaction;
        }
        return sum;
    }

    public Transaction selection(String transaction){
        switch(transaction.toLowerCase()){
            case "deposit":
                return Transaction.DEPOSIT;
            case "withdrawal":
                return Transaction.WITHDRAWAL;
            default:
                return null;
        }
    }



    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}

enum Transaction{
    DEPOSIT, WITHDRAWAL
}
