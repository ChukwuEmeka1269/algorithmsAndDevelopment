package designPrinciples.cat;



import java.util.Date;

public class Sausage implements Food {
    private String color;
    private Date expiration;


    public Sausage(String color, Date expiration) {
        this.color = color;
        this.expiration = expiration;
    }

    public Sausage() {
    }

    public String getColor() {
        return color;
    }

    public Date getExpiration() {
        return expiration;
    }

    @Override
    public void getNutrition() {
        System.out.println("You are eating Sausage...>>>>>>");
        System.out.println("Sausage Nutrition: Vitamin Q");
    }
}
