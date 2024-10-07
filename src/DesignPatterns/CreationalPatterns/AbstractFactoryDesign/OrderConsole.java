package DesignPatterns.CreationalPatterns.AbstractFactoryDesign;

public class OrderConsole {
    private Burger burger;
    private Drink drink;

    public OrderConsole(MealFactory mealFactory){
        burger = mealFactory.createBurger();
        drink = mealFactory.createDrink();
    }

    public void serveMeal(){
        burger.prepareBurger();
        drink.prepareDrink();
        System.out.println("Meal is ready to be served!");
    }

    public static void main(String[] args) {
        MealFactory vegFactory = new VegBurgerRestraunt();
        OrderConsole vegMeal = new OrderConsole(vegFactory);
        vegMeal.serveMeal();

        MealFactory nonVegFactory = new NonVegBurgerRestraunt();
        OrderConsole nonVegMeal = new OrderConsole(nonVegFactory);
        nonVegMeal.serveMeal();
    }
}
