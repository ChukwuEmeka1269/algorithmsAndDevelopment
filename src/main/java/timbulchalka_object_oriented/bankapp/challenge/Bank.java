package timbulchalka_object_oriented.bankapp.challenge;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name){
        this.name = name;
        this.branches = new ArrayList<>();
    }

//    public Bank createBank(String bankName){
//        return new  Bank(bankName);
//    }

    public boolean addBranch(String name){
        if(findBranch(name) == null){
            this.branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        Branch existingBranch = findBranch(branchName);
        if(existingBranch != null){
            existingBranch.newCustomer(customerName, initialTransaction);
            System.out.println(customerName+" added successfully to "+ existingBranch.getBranchName());
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction ){
        Branch existingBranch = findBranch(branchName);
        if(existingBranch != null){
            existingBranch.addCustomerTransaction(customerName, transaction);
            return true;
        }
        System.out.println("Branch does not exist");
        return false;
    }

    public boolean listCustomers(String branchName, boolean printTransaction){
        Branch existingBranch = findBranch(branchName);
        if(existingBranch != null){
            System.out.println("Customer details for "+ existingBranch.getBranchName());
            for(int i=0; i< existingBranch.getCustomers().size(); i++){
                Customer existingCustomer = existingBranch.getCustomers().get(i);
                if(printTransaction){
                    System.out.println("Customer : "+ existingCustomer.getCustomerName()+ " ["+ (i+1) + "]");
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = existingCustomer.getTransactions();
                    for(int j=0; j< transactions.size(); j++){
                        System.out.println("[" + (j+1) + "] " + " Amount "+transactions.get(j));
                    }
                }else{
                    System.out.println((i+1) + "."+existingCustomer.getCustomerName());
                }
            }
            return true;
        }
        return false;
    }

    private Branch findBranch(String branchName){
        for (Branch existingBranch : branches) {
            if (branchName.equals(existingBranch.getBranchName())) {
                return existingBranch;
            }
        }

        return null;
    }

    public String getName() {
        return name;
    }


}
