package DesignPatterns.StructuralPattern.Facade;
/**
 *
 * Facade design patterns comes under structural design patterm.
 * It hides the complexities of the system and provide  the simple interface to the client
 * using which the client can access the system.
 *
 * **/
public class client {
    public static void main(String[] args) {
        ShapeMaker shapeMaker=new ShapeMaker();
        shapeMaker.drawCicle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
