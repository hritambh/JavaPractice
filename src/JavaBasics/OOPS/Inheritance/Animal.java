package JavaBasics.OOPS.Basics.Inheritance;

public class Animal implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("This animal makes sound. But the sound hasn't been specified.");
    }

    public void eat() {
        System.out.println("This animal eats food. But the food hasn't been specified.");
    }
}
