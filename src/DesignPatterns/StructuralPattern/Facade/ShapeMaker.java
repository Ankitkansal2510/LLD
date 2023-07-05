package DesignPatterns.StructuralPattern.Facade;

public class ShapeMaker {
    private final Circle circle;
    private final Rectangle rectangle;
    private final Square square;
    public ShapeMaker(){
        circle=new Circle();
        rectangle=new Rectangle();
        square=new Square();
    }

    public void drawCicle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
