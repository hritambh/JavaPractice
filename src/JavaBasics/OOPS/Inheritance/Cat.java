package JavaBasics.OOPS.Basics.Inheritance;

public class Cat implements InterfaceAnimal {

    @Override
    public void sound() {
        System.out.println("This animal Meows");
    }

    @Override
    public void eat() {
        System.out.println("This animal likes Fish");
    }
}
