package DesignPatterns.AbstractFactoryDesign;

public class NonVegBurgerRestraunt implements MealFactory{
    @Override
    public Burger createBurger() {
        return new NonVegBurger();
    }

    @Override
    public Drink createDrink() {
        return new NonVegDrink();
    }
}
