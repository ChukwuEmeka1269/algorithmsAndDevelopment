package amigoscodeFunctionalPrograming.ramesh.collection;

import java.util.LinkedList;
import java.util.List;

//LinkedList are best for insertion and retrieval
public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> statesInNigeria = new LinkedList<>();

        statesInNigeria.add("Abia");
        statesInNigeria.add("Anambra");
        statesInNigeria.add("Bauchi");
        statesInNigeria.add("Benue");

        System.out.println("Original list");
        System.out.println(statesInNigeria);

        System.out.println("*********");
        System.out.println("Adding to an index position of the list");
        statesInNigeria.add(1, "Adamawa");
        System.out.println("New list => "+ statesInNigeria);

        System.out.println("*********");
        System.out.println("Adding to the first position in the list");
        statesInNigeria.addFirst("Abuja is not a state");
        System.out.println("New list => "+ statesInNigeria);

        System.out.println("*********");
        System.out.println("Adding to the list");
        statesInNigeria.addLast("FCT is the capital territory");
        System.out.println("New list => "+ statesInNigeria);



    }
}
