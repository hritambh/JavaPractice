package DesignPatterns.AbstractFactoryDesign;

public class VegDrink implements Drink{
    @Override
    public void prepareDrink() {
        System.out.println("Preparing Veg Drink");
    }
}
