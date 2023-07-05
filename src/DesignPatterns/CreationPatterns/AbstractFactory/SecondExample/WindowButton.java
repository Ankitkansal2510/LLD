package DesignPatterns.CreationPatterns.AbstractFactory.SecondExample;

public class WindowButton implements Button{
    @Override
    public void createButton() {
        System.out.println("Window Button");
    }
}
