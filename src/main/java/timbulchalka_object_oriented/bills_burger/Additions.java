package timbulchalka_object_oriented.bills_burger;

import java.util.List;

public enum Additions {
    LETTUCE, CARROT, CHEESE, TOMATO, HEALTHY1, HEALTHY2;

    public static float priceOfAddition(Additions additions){
        switch (additions){
            case LETTUCE:
                return 1.5f;
            case CARROT:
                return 1.75f;
            case CHEESE:
                return 1.85f;
            case TOMATO:
                return 2f;
            case HEALTHY1:
                return 2.5f;
            case HEALTHY2:
                return 2.65f;
            default:
                return 0f;
        }
    }

    public static float totalPriceOfAdditions() {
        float sum = 0;
        for(Additions add : Additions.values()){
            sum += Additions.priceOfAddition(add);
        }

        return sum;
    }

    public static float totalPriceOfAdditions(List<Additions> additions){
        float sum = 0;
        for (Additions addition : additions) {
            sum += Additions.priceOfAddition(addition);
        }
        return sum;
    }
}
