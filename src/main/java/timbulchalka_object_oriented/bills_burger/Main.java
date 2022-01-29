package timbulchalka_object_oriented.bills_burger;

import java.text.NumberFormat;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger(Meat.BEEF, BreadRoll.PLAIN, 250);
        Hamburger healthyBurger = new HealthyBurger();

        List<Additions> additionsList = List.of(Additions.CHEESE, Additions.LETTUCE, Additions.HEALTHY1);

        showAdditions(additionsList);
        processOrder(healthyBurger, additionsList);









    }

    public static void processOrder(Hamburger hamburger, List<Additions> additions){


        for(Additions adds : additions){
            System.out.println("Price of " + adds.name() + " = " + NumberFormat.getCurrencyInstance().format(Additions.priceOfAddition(adds)));
        }

        System.out.println("Base price of " + hamburger.getClass().getSimpleName() + " = " + NumberFormat.getCurrencyInstance().format(hamburger.getBasePrice()));
        float priceOfHamburger = hamburger.totalPriceOfHamburger(additions);
        String formattedPrice = NumberFormat.getCurrencyInstance().format(priceOfHamburger);
        System.out.println("Total price of Hamburger with additions = " + formattedPrice);
    }



    public static void showAdditions(List<Additions> additionsList){
        System.out.println("Your selected Additions are listed below: ");
        for(Additions add : additionsList){
            System.out.println(add.name());
        }
    }
}
