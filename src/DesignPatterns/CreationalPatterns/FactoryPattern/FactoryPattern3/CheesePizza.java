package DesignPatterns.CreationalPatterns.FactoryPattern.FactoryPattern3;

public class CheesePizza implements Pizza{
//    CheesePizza(){
//        prepare();
//    }
    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza");
    }
}
