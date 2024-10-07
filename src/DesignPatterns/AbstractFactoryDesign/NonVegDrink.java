package DesignPatterns.AbstractFactoryDesign;

public class NonVegDrink implements Drink{
    @Override
    public void prepareDrink() {
        System.out.println("Preparing Non-Veg Drink");
    }
}
