package JavaBasics.Interface_AbstractClass.Example1;

abstract class Animal {
    abstract void makeSound(); // abstract method

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal{

    @Override
    void makeSound() {
        System.out.println("Making sound");
    }
}

