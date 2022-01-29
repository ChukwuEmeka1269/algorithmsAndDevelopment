package timbulchalka_object_oriented.mobilephone_app;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public static Contact createNewContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    }

    public Contact editContactName(String oldName, String newName){
        if(this.name.equalsIgnoreCase(oldName)){
            this.name = newName;
        }
        return new Contact(newName, this.phoneNumber);
    }

    public Contact editContactPhoneNumber(String name, String newPhoneNumber){
        if(this.name.equalsIgnoreCase(name)){
            this.phoneNumber = newPhoneNumber;
        }

        return new Contact(name, this.phoneNumber);
    }

    public Contact editContact(String name, String newName, String newPhoneNumber){
        if(this.name.equalsIgnoreCase(name)){
            this.name = newName;
            this.phoneNumber = newPhoneNumber;
        }
        return new Contact(this.name, this.phoneNumber);
    }


    public String getName() {
        return name;
    }



    public String getPhoneNumber() {
        return phoneNumber;
    }


}
