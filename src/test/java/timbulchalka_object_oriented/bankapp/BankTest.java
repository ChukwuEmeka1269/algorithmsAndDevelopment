package timbulchalka_object_oriented.bankapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    @Disabled
    void addListOfBranches() {
    }

    @Test
    @DisplayName("Create A New Bank")
    Bank shouldCreateBank() {
        //Given
        String bankName = "UBA";
        //When
        Bank createdBank = Bank.createBank(bankName);
        //Then
        assertEquals(createdBank.getBankName(), "UBA");

        return createdBank;
    }

    @Test
    @Disabled
    void singleCustomerTransaction() {

    }

    @Test
    @DisplayName("Add New Branch")
    Branch shouldAddNewBranch() {
        //Given
        String branchName = "Ajah";
        //When
        Bank bank = shouldCreateBank();
        Branch branch = bank.addNewBranch(branchName);
        //Then
        assertEquals(branch.getBranchName(), "Ajah");

        return branch;

    }

    @Test
    @DisplayName("Add New Customer To Branch")
    void addCustomerToBranch() {
        String customerName = "Balogun";
        double initialDeposit = 250.0;
        Branch branch = shouldAddNewBranch();
        boolean newCustomerAdded = branch.addCustomer(customerName, initialDeposit);
        assertTrue(newCustomerAdded);
    }

    @Test
    @Disabled
    void printCustomerListOfABranch() {
    }

    @Test
    @Disabled
    void printListOfBranches() {
    }

    @Test
    void getBankName() {
        Bank bank = shouldCreateBank();
        String bankName = bank.getBankName();
        assertEquals(bankName, "UBA");

    }

    @Test
    @Disabled
    void getListOfBranches() {
    }
}