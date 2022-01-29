package timbulchalka_object_oriented.mobilephone_app.challenge;

import java.util.ArrayList;

public class Mobile {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public Mobile(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public Contact queryContact(String name){
        int index = findContact(name);
        if(index >= 0){
            Contact contact = this.myContacts.get(index);
            System.out.println("Found contact. Name -> "+ contact.getName() + " Phone Number -> "+contact.getPhoneNumber());
            return contact;
        }
        return null;
    }

    public void printContactList(){
        System.out.println("You have "+ this.myContacts.size()+ " contact in you phone.");
        System.out.println("Index  Name    Phone Number");
        System.out.println("Contact List:");
        for(int i=0; i< this.myContacts.size();i++){
            System.out.println((i+1) + ". " + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) >=0){
            System.out.println("Name already exist.");
            return false;
        }else{
            this.myContacts.add(contact);
            System.out.println("Contact added successfully");
            return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int index = findContact(oldContact);
        if(index >= 0 && !(newContact.equals(oldContact))){
                this.myContacts.set(index, newContact);
                System.out.println("Update successful.");
                return true;
        }
        else{
            System.out.println("Not found.");
            return false;
        }
    }

    public boolean removeContact(Contact contact){
        int index = findContact(contact.getName());
        if(index >= 0){
            this.myContacts.remove(index);
            System.out.println("removed.");
            return true;
        }else{
            System.out.println("Not found.");
            return false;
        }

    }

    public int findContact(Contact contact){
       return this.myContacts.indexOf(contact);
    }

    public int findContact(String name){
        for(int i=0 ; i< this.myContacts.size(); i++){
            if(name.equalsIgnoreCase(this.myContacts.get(i).getName())){
                return i;
            }
        }

        return -1;
    }

}
