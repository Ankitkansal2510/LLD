package DesignPatterns.BehaviourPatterns.Strategy;

public class KungFu extends MartialArts{

    KickStrategy kickStrategy;

    public KungFu(KickStrategy kickStrategy) {
        this.kickStrategy=kickStrategy;

    }

    @Override
    void kick() {
        kickStrategy.kick();
    }
}
