package DesignPatterns.CreationalPatterns.FactoryPattern.FactoryPattern3;

public class Main {
    public static void main(String[] args) {
        PizzaFactory fac = new PizzaFactory();
        Pizza pizza1 = fac.createPizza("cheese_pizza");
        pizza1.prepare();
        Pizza pizza2 = fac.createPizza("pepperoni_pizza");
        pizza2.prepare();
    }
}
