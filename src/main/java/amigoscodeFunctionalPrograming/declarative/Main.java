package amigoscodeFunctionalPrograming.declarative;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Florence", Gender.FEMALE),
                new Person("Francis", Gender.MALE),
                new Person("Ebube", Gender.MALE),
                new Person("Gracella", Gender.FEMALE),
                new Person("Rachael", Gender.FEMALE),
                new Person("Vidic", Gender.MALE)
        );

        List<Person> femalesCollection = persons.stream().filter(person -> Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList());


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
