package DesignPatterns.CreationalPatterns.FactoryPattern.FactoryPattern3;

class PizzaFactory {
    public Pizza createPizza (String type){
         if (type == "cheese_pizza"){
             return new CheesePizza();
         } else if (type == "pepperoni_pizza") {
             return new PepperoniPizza();
         } else
             return null;
    }
}
