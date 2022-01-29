package timbulchalka_object_oriented.mobilephone_app.challenge;

public class Main {
    public static void main(String[] args) {
        Mobile phone = new Mobile("samsung");
        Contact john = new Contact("John", "0908765432");
        Contact mike = new Contact("Mike", "0908723432");
        Contact ejike = new Contact("Ejike", "0818723432");
        Contact ejike1 = new Contact("Ejike", "0818755432");
        Contact emma = new Contact("Emma", "0409387262");
        Contact emma2 = new Contact("Emma", "0818723432");

        phone.addNewContact(john);
        phone.addNewContact(mike);
        phone.addNewContact(ejike);
        phone.addNewContact(ejike1);

        phone.printContactList();
//        phone.queryContact("Mike");
//
////        phone.updateContact(ejike, emma);
//        phone.updateContact(ejike, emma2);
//        phone.printContactList();
//
//        phone.removeContact(emma2);
//        phone.printContactList();
    }
}
