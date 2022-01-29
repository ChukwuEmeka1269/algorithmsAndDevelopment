package amigoscodeFunctionalPrograming.imperative;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("John Travotla", Gender.MALE),
                new Person("Matt Wells", Gender.MALE),
                new Person("Annie Chuks", Gender.FEMALE),
                new Person("Vicky Rolls", Gender.FEMALE),
                new Person("Grace Abah", Gender.FEMALE)
        );

        List<Person> females = new ArrayList<>();
        for(Person person: persons){
            if(person.gender.equals(Gender.FEMALE)){
                females.add(person);
            }
        }

        for(Person female: females){
            System.out.println(female);
        }


    }

    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }


    enum Gender{
        MALE, FEMALE
    }
}

