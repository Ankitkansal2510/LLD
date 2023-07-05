package DesignPatterns.CreationPatterns.AbstractFactory.SecondExample;

public class Client {
    public static void main(String[] args) {
        AbstractFactory abstractFactory=FactoryProducer.getFactory("Mac");
        Button button=abstractFactory.getButton();
        button.createButton();

        AbstractFactory abstractFactory1=FactoryProducer.getFactory("Window");
        Button button1=abstractFactory1.getButton();
        button1.createButton();
    }
}
