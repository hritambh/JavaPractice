package DesignPatterns.AbstractFactoryDesign;

public class VegBurgerRestraunt implements MealFactory{
    @Override
    public Burger createBurger() {
        return new VegBurger();
    }

    @Override
    public Drink createDrink() {
        return new VegDrink();
    }
}
