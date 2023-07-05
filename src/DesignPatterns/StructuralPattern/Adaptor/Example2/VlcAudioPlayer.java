package DesignPatterns.StructuralPattern.Adaptor.Example2;

public class VlcAudioPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String audioType, String fileName) {
        System.out.println("Playing " + audioType + " " +  "with filename : " + fileName);
    }

    @Override
    public void playMp4(String audioType, String fileName) {

    }
}
