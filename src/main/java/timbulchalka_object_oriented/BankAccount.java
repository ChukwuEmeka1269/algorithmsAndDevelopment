package timbulchalka_object_oriented;


public class BankAccount {
    private double accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public void depositFund(double amountToBeDeposited){
        if(amountToBeDeposited < 0)
            System.out.println("Deposit amount too small");
        else{
             this.balance += amountToBeDeposited;
        }
    }

    public void withdrawFund(double amountToBeWithdrawn){
        if(amountToBeWithdrawn > this.balance)
            System.out.println("Cannot perform withdrawal. Insufficient balance.");
        else{
            this.balance -= amountToBeWithdrawn;
        }
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
