package DesignPatterns.CreationPatterns.AbstractFactory.FirstExample;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside normal Rectangle method");
    }
}
