package DesignPatterns.BehaviourPatterns.Strategy;
/**
 * Strategy design pattern comes under behaviour design pattern.In this pattern the algo or the
 * class behaviour can be changed at a runtime.
 *
 * Here we have define interfeace KickStrategy
 *
 * We have design two class normalkick strategy and the Flying kick strategy both implements
 * kickStrategy
 *
 * At runtime we are passing which tupe of kick kungfu class wants
 *
 * */
public class Client {
    public static void main(String[] args) {
       KungFu NormalkungFu=new KungFu(new NormalKick());
        NormalkungFu.kick();


        KungFu flyingKungFul=new KungFu(new FLyinkKick());
        flyingKungFul.kick();
    }
}
