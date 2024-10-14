package DesignPatterns.CreationalPatterns.FactoryPattern.FactoryPattern3;

public class PepperoniPizza implements Pizza{
//    PepperoniPizza(){
//        prepare();
//    }
    @Override
    public void prepare() {
        System.out.println("Preparing Pepperoni Pizza");
    }
}
