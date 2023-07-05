package DesignPatterns.CreationPatterns.AbstractFactory.FirstExample;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside normal square method ");
    }
}
