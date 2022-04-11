package timbulchalka_object_oriented.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        insertPlacesByOrder(placesToVisit, "Jos");
        insertPlacesByOrder(placesToVisit, "Canada");
        insertPlacesByOrder(placesToVisit, "Holland");
        insertPlacesByOrder(placesToVisit, "Abuja");

        printList(placesToVisit);

//        insertPlacesByOrder(placesToVisit, "Holland");
//        printList(placesToVisit);


    }

    private static void printList(LinkedList<String> placesToVisit) {
        Iterator<String> stringIterator = placesToVisit.iterator();
        while(stringIterator.hasNext()){
            System.out.println("Visiting.." + stringIterator.next());
        }

//        placesToVisit.forEach(System.out::println);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    private static boolean insertPlacesByOrder(LinkedList<String> places, String newCity){
        ListIterator<String> stringListIterator = places.listIterator();
        while(stringListIterator.hasNext()){
            int compareCity = stringListIterator.next().compareTo(newCity);
            if(compareCity == 0){
                //Current city is same as the new city. Do not add
                System.out.println(newCity + " has already been visited.");
                return false;
            }
            else if(compareCity > 0){
                //new city come before the current city and should appear before the current city on the list.
                // Go back to the previous position and add new city
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }

        }
        stringListIterator.add(newCity);
        return true;
    }

    private static boolean insertPlacesByOrder2(LinkedList<String> places, String newCity){
        ListIterator<String> stringListIterator = places.listIterator();
//        while(stringListIterator.hasNext()){
//            int compareCity = stringListIterator.next().compareTo(newCity);
//            if(compareCity == 0){
//                //Current city is same as the new city. Do not add
//                System.out.println(newCity + " has already been visited.");
//                return false;
//            }
//            else if(compareCity > 0){
//                //new city come before the current city and should appear before the current city on the list.
//                // Go back to the previous position and add new city
//                stringListIterator.previous();
//                stringListIterator.add(newCity);
//                return true;
//            }
//
//        }
//        stringListIterator.add(newCity);
//        return true;
        return true
                ;
    }
}
