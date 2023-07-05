package DesignPatterns.CreationPatterns.AbstractFactory.SecondExample;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factory){
        if(factory.equalsIgnoreCase("Mac")){
            return new MacFactory();
        }else if(factory.equalsIgnoreCase("Window")){
            return new WindowFactory();
        }
        return null;
    }
}
