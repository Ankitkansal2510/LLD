package DesignPatterns.BehaviourPatterns.Strategy;

public class FLyinkKick implements KickStrategy{
    @Override
    public void kick() {
        System.out.println("Flyink kick");
    }
}
