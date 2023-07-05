package DesignPatterns.BehaviourPatterns.Strategy;

public class NormalKick implements KickStrategy{
    @Override
    public void kick() {
        System.out.println("Normal Kick");
    }
}
