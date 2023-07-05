package DesignPatterns.CreationPatterns.AbstractFactory.SecondExample;

public class MacFactory extends AbstractFactory{
    @Override
    public Button getButton() {
        return new MacButton();
    }
}
