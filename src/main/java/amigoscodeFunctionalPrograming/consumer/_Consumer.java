package amigoscodeFunctionalPrograming.consumer;


import java.util.function.BiConsumer;
import java.util.function.Consumer;

//A Consumer is an operation that takes in a single input and returns no result
public class _Consumer {
    public static void main(String[] args) {
        Customer nelson = new Customer("Nelson", "0908765435");
        greetCustomer.accept(nelson);
    }

   private static class Customer {
        private String name;
        private String phone;

        public Customer(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
    }


    static Consumer<Customer> greetCustomer = customer -> System.out.println("Hello, " + customer.name + ". Your number is " + customer.phone);

    //Takes in 2 arguments
    static BiConsumer<Customer, Boolean> greetCustomerV2 = (customer, showPhone) ->
        System.out.println("Hello, "+ customer.name + " "+ (showPhone ? customer.name : "***********"));



}


