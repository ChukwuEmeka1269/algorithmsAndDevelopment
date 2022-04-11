package amigoscodeFunctionalPrograming.ramesh.collection;

import java.util.*;

public class CollectionsEx {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Columbia");
        countries.add("Canada");
        countries.add("Russia");
        countries.add("Ukraina");

        List<String> westAfricanCountries = new ArrayList<>();
        westAfricanCountries.add("Nigeria");
        westAfricanCountries.add("Ghana");
        westAfricanCountries.add("Benin");
        westAfricanCountries.add("Gabon");
        westAfricanCountries.add("Liberia");

        countries.addAll(westAfricanCountries);
        System.out.println("List of countries with WA countries");
        System.out.println(countries);

        countries.removeAll(westAfricanCountries);
        System.out.println("List of countries without WA countries");
        System.out.println(countries);


        //Iterating over a list java 7 way
        System.out.println("*************");
        System.out.println("Looping with normal for loop");
        for(int i=0; i<westAfricanCountries.size(); i++){
            System.out.println(westAfricanCountries.get(i));
        }

        System.out.println("*************");
        System.out.println("Using For-in loop");
        //Iterating using the for-in loop
        for(String country: westAfricanCountries){
            System.out.println(country);
        }

        //Using the iterator
        System.out.println("*************");
        System.out.println("Looping with an iterator");
        for(Iterator<String> iterator = westAfricanCountries.iterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }

        //Using Java 8 for-each method
        System.out.println("Using Java 8 For-each method");
        System.out.println("*************");
        westAfricanCountries.forEach(System.out::println);

        //Using Stream API
        System.out.println("Using Java 8 For-each method");
        System.out.println("*************");
        westAfricanCountries.stream().forEach( System.out::println);

        ListIterator<String> listIterator = countries.listIterator();

        //Forward iteration using list iterator
        System.out.println("*************");
        System.out.println("Forward iteration using listIterator");

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("*************");
        System.out.println("Backward iteration using listIterator");

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        System.out.println("*************");
        System.out.println("Random iteration using listIterator");
        String word = "Nigeria";
        StringBuilder builder = new StringBuilder();


        int end = word.length() -1;

        while(end >=0){
            builder.append(word.charAt(end));
            end--;
        }

        System.out.println(builder);





    }


}
