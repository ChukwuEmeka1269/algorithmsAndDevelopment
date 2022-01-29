package timbulchalka_object_oriented.bills_burger;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Hamburger {
    private String burgerName;
    private Meat meat;
    private BreadRoll breadRollType;
    private float basePrice;
    private Additions lettuce;
    private Additions carrot;
    private Additions cheese;
    private Additions tomato;

    public Hamburger(Meat meat, BreadRoll breadRollType, float basePrice) {
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.basePrice = basePrice;
        this.burgerName = "Hamburger";
        this.lettuce = Additions.LETTUCE;
        this.carrot = Additions.CARROT;
        this.cheese = Additions.CHEESE;
        this.tomato = Additions.TOMATO;
    }





//    public float totalPriceOfHamburger(){
//        return this.basePrice + Additions.totalPriceOfAdditions();
//    }



    public float totalPriceOfHamburger(Additions addition){
            return this.basePrice + Additions.priceOfAddition(addition);
    }

    public float totalPriceOfHamburger(List<Additions> additions){
        return this.basePrice + Additions.totalPriceOfAdditions(additions);
    }

    public String getBurgerName() {
        return burgerName;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    public Meat getMeat() {
        return meat;
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    public BreadRoll getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(BreadRoll breadRollType) {
        this.breadRollType = breadRollType;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    public Additions getLettuce() {
        return lettuce;
    }

    public void setLettuce(Additions lettuce) {
        this.lettuce = lettuce;
    }

    public Additions getCarrot() {
        return carrot;
    }

    public void setCarrot(Additions carrot) {
        this.carrot = carrot;
    }

    public Additions getCheese() {
        return cheese;
    }

    public void setCheese(Additions cheese) {
        this.cheese = cheese;
    }

    public Additions getTomato() {
        return tomato;
    }

    public void setTomato(Additions tomato) {
        this.tomato = tomato;
    }
}
