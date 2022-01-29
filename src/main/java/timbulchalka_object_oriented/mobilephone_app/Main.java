package timbulchalka_object_oriented.mobilephone_app;

import java.util.Scanner;

public class Main {
    private static MobilePhone mobilePhone = new MobilePhone("Samsung");
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        menu();
    }

    public static void menu(){
        printOptions();
        boolean quit = false;
        int option = 0;
        startPhone();

        while (!quit){
            System.out.println("Please enter selection: \nPress 0 to see list of options.");
            option = scanner.nextInt();
            scanner.nextLine();
            switch(option){
                case 0:
                    printOptions();
                    break;
                case 1:
                    printList();
                    break;
                case 2:
                    saveContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    queryList();
                    break;
                case 7:
                    quit = true;
                    System.out.println("Thank you for using mobile app. Good bye.");
                    System.out.println("Shutting down..........");
                    break;
            }
        }
    }

    private static void queryList() {
        System.out.print("Enter name to query: ");
        String name = scanner.nextLine();
        System.out.print("Enter the contact phone number: ");
        String phoneNumber = scanner.nextLine();
        Contact contact = Contact.createNewContact(name, phoneNumber);
        String queryContact = mobilePhone.queryContact(contact);
        System.out.println(queryContact + " was found in contact list.");

    }

    private static void startPhone() {
        System.out.println("initializing data..........");
        System.out.println("Processing..........");
        System.out.println("Starting phone..........");
    }

    private static void printList() {
        mobilePhone.printContactList();
    }


    private static void searchContact() {
        System.out.println("Enter contact name to search: ");
        String searchName = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(searchName);
        if(existingContact == null){
            System.out.println("Contact not found.");
        }
        else{
            System.out.println("Contact found. Name: " + existingContact.getName() + ", Phone Number: " + existingContact.getPhoneNumber());
        }
    }

    private static void removeContact() {
        System.out.println("Enter contact name to delete: ");
        String searchName = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(searchName);
        if(existingContact == null){
            System.out.println("Contact not found.");
        }else{
            if(mobilePhone.deleteContact(existingContact)){
                System.out.println("Successfully deleted " + existingContact.getName() + " from the contact list." );
            }else{
                System.out.println("An error occurred while deleting contact. ");
            }
        }


    }


    private static void updateContact() {
        System.out.println("Enter contact name: ");
        String searchName = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(searchName);
        if(existingContact == null){
            System.out.println("Contact not found.");
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createNewContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContact, newContact)){
            System.out.println("Contact has been successfully updated.");
        } else{
            System.out.println("An error occurred while updating contact.");
        }
    }


    private static void saveContact() {
        System.out.println("Enter contact name: ");
        String name =  scanner.next();
        System.out.println("Enter contact phoneNumber: ");
        String phoneNumber = scanner.next();
        Contact newContact =  Contact.createNewContact(name, phoneNumber);
        if(mobilePhone.addContact(newContact)){
            System.out.println("Contacted added. Name: " + name + ", phone Number: " + phoneNumber);
        }else{
            System.out.println("You already have a contact with "+ name + " in phone book.");
        }
    }


    private static void printOptions() {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print selections.");
        System.out.println("\t 1 - To print contact list");
        System.out.println("\t 2 - To save a contact");
        System.out.println("\t 3 - To edit contact details");
        System.out.println("\t 4 - To remove a contact from list");
        System.out.println("\t 5 - To search for contact ");
        System.out.println("\t 6 - To query contact list");
        System.out.println("\t 7 - To shut down.");
    }
}
