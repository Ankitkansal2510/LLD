package DesignPatterns.CreationPatterns.AbstractFactory.FirstExample;

public class Client {
    public static void main(String[] args) {
        AbstractFactory abstractFactory=FactoryProducer.getFactory("rounded");
       Shape shape= abstractFactory.getShape("Rectangle");
       shape.draw();

       AbstractFactory abstractFactory1=FactoryProducer.getFactory("Normal");
       Shape shape1=abstractFactory1.getShape("rectangle");
       shape1.draw();

       AbstractFactory abstractFactory2=FactoryProducer.getFactory("rounded");
       Shape shape2=abstractFactory2.getShape("square");
       shape2.draw();

        AbstractFactory abstractFactory3=FactoryProducer.getFactory("Normal");
        Shape shape3=abstractFactory3.getShape("square");
        shape3.draw();
    }
}
