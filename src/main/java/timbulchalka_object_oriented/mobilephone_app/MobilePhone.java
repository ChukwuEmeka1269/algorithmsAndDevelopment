package timbulchalka_object_oriented.mobilephone_app;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private String phoneName;
    private ArrayList<Contact> listOfContacts;

    public MobilePhone(String phoneName) {
        this.phoneName = phoneName;
        this.listOfContacts = new ArrayList<>();
    }

    public void printContactList(){
        System.out.println("You have " + listOfContacts.size() + " contacts in your list");
        for (Contact listOfContact : listOfContacts) {
            System.out.println("Name: "+listOfContact.getName()+ ", PhoneNumber: " + listOfContact.getPhoneNumber());
        }
    }



    public boolean addContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact already exist.");
            return false;
        }
        listOfContacts.add(contact);
        return true;

    }

    public  boolean updateContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);

        if(position < 0){
            System.out.println(oldContact.getName() + " was not found");
            return false;
        }else if(findContact(newContact.getName()) != -1){
            System.out.println(newContact.getName() + " already exist. \nUpdate failed!");
            return false;
        }
        this.listOfContacts.set(position, newContact);
        System.out.println(oldContact.getName() + " has been successfully updated to " + newContact.getName());
        return true;
    }

    public boolean deleteContact(Contact contact){
        int position = findContact(contact.getName());
            if (position >= 0) {
                this.listOfContacts.remove(position);
                System.out.println(contact.getName()+ " was found and removed from contact list.");
                return true;
            }
            else{
                System.out.println("contact not found.");
                return false;
            }
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return this.listOfContacts.get(position);
        }

        return null;
    }


    public String queryContact(Contact contact){
        /**
         * int index = findContact(contact);
         *         if(index < 0){
         *             System.out.println(contact.getName() + " was not found in the contact list.");
         *             return null;
         *         }
         *         else{
         *             System.out.println("Found ya!");
         *             return contact.getName();
         *         }
         */
        boolean exists = isContactOnList(contact.getName());
        if(exists){
            return contact.getName();
        }
        return null;
    }

    private int findContact(Contact contact){
       return listOfContacts.indexOf(contact);
    }

    private int findContact(String name){
        for(int i=0; i< this.listOfContacts.size(); i++){
            Contact contact = listOfContacts.get(i);
            if(name.equalsIgnoreCase(contact.getName())){
                return i;
            }
        }
        return -1;
    }



    private  boolean isContactOnList(String name){
        int contactInList = findContact(name);
        if(contactInList >= 0){
            System.out.println(name + " found.");
            return true;
        } else {
            System.out.println(name + " not found in contact list.");
            return false;
        }
    }
}
