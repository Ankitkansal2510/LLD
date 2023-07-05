package DesignPatterns.CreationPatterns.Factory;

public class shapeFactory {

    public static Shape getInstance(String type)throws Exception{
        if("circle".equalsIgnoreCase(type)){
            return new Circle();
        }else if("rectangle".equalsIgnoreCase(type)){
            return new Rectangle();
        }else if("square".equalsIgnoreCase(type)){
            return new Square();
        }else{
            throw new Exception("Invalid shape passed");
        }
    }
}
