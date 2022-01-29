package timbulchalka_object_oriented.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ProcessList {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int selection = 0;
        printInstruction();
        while(!quit){
            System.out.println("Enter selection: ");
            selection = scanner.nextInt();

            scanner.nextLine();

            switch (selection){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printShoppingList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    updateItemInList();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    processList();
                    break;
                case 7:
                    quit = true;
                    System.out.println("Thank you for using our application. Come back again. Bye for now.");
                    break;
                default:
                    System.out.println(" Sorry, you typed a wrong input");
                    printInstruction();

            }
        }
    }

    private static void processList() {
        new ArrayList<>(groceryList.getShoppingList());
    }

    private static void searchItem() {
        System.out.print("Enter new item:");
        String item = scanner.nextLine();
        if(groceryList.onFile(item)){
            System.out.println("Found "+ item);
        }else{
            System.out.println("item "+ " not on file.");
        }
    }

    private static void removeItem() {
        System.out.print("Enter item to be removed: ");
        String item = scanner.nextLine();
        groceryList.removeItem(item);
    }

    private static void updateItemInList() {
        System.out.print("Enter item to be edited: ");
        String oldItem = scanner.nextLine();
        System.out.print("Enter new item:");
        String newItem = scanner.nextLine();
        groceryList.modifyItem(oldItem, newItem);
    }

    private static void addItem() {
        System.out.print("Please enter an item to be added to your shopping list: ");
        String item = scanner.next();
        groceryList.addItem(item);
    }

    private static void printInstruction() {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print selections.");
        System.out.println("\t 1 - To print list of shopping items");
        System.out.println("\t 2 - To add an item to shopping list");
        System.out.println("\t 3 - To edit an item on shopping list");
        System.out.println("\t 4 - To remove an item from shopping list");
        System.out.println("\t 5 - To search an item in shopping list");
        System.out.println("\t 6 - To quit program");
    }


}
