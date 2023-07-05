package DesignPatterns.StructuralPattern.Adaptor.Example2;

public interface AdvancedMediaPlayer {

    void playVlc(String audioType, String fileName);
    void playMp4(String audioType,String fileName);
}
