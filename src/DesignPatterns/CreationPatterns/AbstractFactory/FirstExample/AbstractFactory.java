package DesignPatterns.CreationPatterns.AbstractFactory.FirstExample;
//Creating abstract class to get factory of rounded and normal objects
public abstract class AbstractFactory {

    public abstract Shape getShape(String shapeType);
}
