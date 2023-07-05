package DesignPatterns.StructuralPattern.Adaptor.Example2;

public class Mp4AudioPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String audioType, String fileName) {

    }

    @Override
    public void playMp4(String audioType, String fileName) {
        System.out.println("Playing " + audioType + " " +  "with filename : " + fileName);
    }
}
