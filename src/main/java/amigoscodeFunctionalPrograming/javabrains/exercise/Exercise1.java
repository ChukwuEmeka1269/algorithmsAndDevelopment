package amigoscodeFunctionalPrograming.javabrains.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Exercise1 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Ogamba", "Sophie", 50),
                new Person("Ebele", "Hannah", 21),
                new Person("Charles", "Chuk", 48),
                new Person("Elvis", "Presley", 80),
                new Person("Wizkid", "Cameleon", 32)
        );

        //Sort the list by lastname
//        sortPeopleByLastname(people);
        people.sort(
                Comparator.comparing(Person::getLastname)
                //or do this (person1, person2) -> person1.getLastname().compareTo(person2.getLastname())
        );



        //create a method that prints all elements in the list
//        printAll(people);
        people.forEach(System.out::println);

        System.out.println("Printing people with firstname letter W");
        people.stream().filter(person -> person.getFirstname().startsWith("W")).forEach(System.out::println);


        //create a method that prints all people that have last name begin with C
        System.out.println("********");
        System.out.println("People with lastname starting with C");
//        printLastnamesBeginningWithC(people);
        people.stream().filter(person -> person.getLastname().startsWith("C")).forEach(person -> System.out.println(person));
    }

    public static void sortPeopleByLastname(List<Person> people, Condition condition){
        for(Person person: people){
            if(condition.contains(person)){
                System.out.println(person);
            }
        }

    }

    public static void printLastnamesBeginningWithC(List<Person> people){
        for(Person person: people){
            if(person.getLastname().startsWith("C")){
                System.out.println(person);
            }
        }
    }

    public static void printAll(List<Person> people){
        for(Person person: people){
            System.out.println(person);
        }
    }

    interface Condition{
        boolean contains(Person person);
    }


}
