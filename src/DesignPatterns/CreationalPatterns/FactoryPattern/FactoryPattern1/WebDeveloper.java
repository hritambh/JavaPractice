package DesignPatterns.CreationalPatterns.FactoryPattern.FactoryPattern1;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Fetching Web Developer's Salary");
        return 40000;
    }
}
