package DesignPatterns.CreationPatterns.AbstractFactory.SecondExample;

public class WindowFactory extends AbstractFactory{
    @Override
    public Button getButton() {
        return new WindowButton();
    }
}
