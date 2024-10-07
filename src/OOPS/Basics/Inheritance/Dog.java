package OOPS.Basics.Inheritance;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("This dog likes to eat Bones");
    }
    public void sound() {
        System.out.println("This animal Barks");
    }
}
