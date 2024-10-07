package DesignPatterns.CreationalPatterns.FactoryPattern.FactoryPattern1;

public class OrgFactory {
    public static Employee getEmployee(String type){
        if (type.equalsIgnoreCase("ANDROID"))
            return new AndroidDev();
        else if (type.trim().equalsIgnoreCase("WEB")) {
            return new WebDeveloper();
        }
        return null;
    }
}
