package DesignPatterns.CreationPatterns.AbstractFactory.FirstExample;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("Rectangle")){
            return new RoundedRectangle();
        }else if(shapeType.equalsIgnoreCase("Square")){
            return new RoundedSquare();
        }
        return null;
    }
}
