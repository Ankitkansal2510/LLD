package DesignPatterns.CreationPatterns.Factory;
/***
 * Factory Design pattern comes under creational design patterm.
 * It helps to decouple the construction of the object from client.
 *
 * */
public class Client {
    public static void main(String[] args)throws Exception {
        Shape shape=shapeFactory.getInstance("circle");
        shape.draw();

        Shape shape1=shapeFactory.getInstance("rectangle");
        shape1.draw();

        Shape shape2=shapeFactory.getInstance("square");
        shape2.draw();

        Shape shape3=shapeFactory.getInstance("cuboid");
        shape3.draw();
    }
}
