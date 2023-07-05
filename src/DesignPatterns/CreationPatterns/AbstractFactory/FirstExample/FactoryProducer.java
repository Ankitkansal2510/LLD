package DesignPatterns.CreationPatterns.AbstractFactory.FirstExample;
//it will produce the factory whether rounded factory or nornal factory
public class FactoryProducer {
    public static AbstractFactory getFactory(String factory){
        if(factory.equalsIgnoreCase("rounded")){
            return new RoundedShapeFactory();
        }else if(factory.equalsIgnoreCase("Normal")){
            return new NormalShapeFactory();
        }
        return null;
    }
}
