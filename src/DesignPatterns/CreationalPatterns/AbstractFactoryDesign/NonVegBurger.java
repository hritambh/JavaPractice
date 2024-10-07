package DesignPatterns.CreationalPatterns.AbstractFactoryDesign;

public class NonVegBurger implements Burger{
    @Override
    public void prepareBurger() {
        System.out.println("Preparing Non-Veg Burger");
    }
}
