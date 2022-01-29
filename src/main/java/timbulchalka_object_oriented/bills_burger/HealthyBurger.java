package timbulchalka_object_oriented.bills_burger;

import java.text.NumberFormat;
import java.util.List;

public class HealthyBurger extends Hamburger{
    private Additions addition1;
    private Additions addition2;

    public HealthyBurger() {
        super(Meat.CHICKEN, BreadRoll.BROWN_RYE, 270);
        this.addition1 = Additions.HEALTHY1;
        this.addition2 = Additions.HEALTHY2;

    }

}
