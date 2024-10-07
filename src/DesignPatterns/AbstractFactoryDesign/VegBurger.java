package DesignPatterns.AbstractFactoryDesign;

public class VegBurger implements Burger{
    @Override
    public void prepareBurger() {
        System.out.println("Preparing Veg Burger");
    }
}
