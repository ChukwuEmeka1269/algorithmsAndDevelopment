package timbulchalka_object_oriented.arraylist;

import java.util.ArrayList;

public class GroceryList {
    private static ArrayList<String> shoppingList = new ArrayList<>();

    public ArrayList<String> getShoppingList() {
        return shoppingList;
    }

    public void addItem(String item){
        shoppingList.add(item);
    }

    public void printShoppingList(){
        System.out.println("There are " + shoppingList.size() + " items in your shopping list.");
        for(int i=0; i<shoppingList.size(); i++){
            System.out.println((i+1) + " . " + shoppingList.get(i));
        }
    }

    public void modifyItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >= 0){
            modifyItem(position, newItem);
        }
    }

    private void modifyItem(int position, String newItem){
        String itemInList = shoppingList.get(position);
        if(itemInList != null){
            shoppingList.set(position, newItem);
        }

        System.out.println("Item has been successfully modified from " + itemInList + " to " + newItem);
    }

    public void removeItem(String item){
        int position = findItem(item);
        if(position >= 0){
            removeItem(position);
        }
    }

    private void removeItem(int position){

            shoppingList.remove(position);

        System.out.println("Item " + shoppingList.get(position) + " has been removed successfully from the shopping list.");
    }

    private int findItem(String item){
       return shoppingList.indexOf(item);
    }

    public boolean onFile(String item){
        int position = findItem(item);
        return position >= 0;
    }
}
