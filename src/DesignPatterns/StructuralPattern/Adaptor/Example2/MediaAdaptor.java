package DesignPatterns.StructuralPattern.Adaptor.Example2;

public class MediaAdaptor implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdaptor(String audioType) {
        if(audioType.equalsIgnoreCase("VLC")){
            advancedMediaPlayer=new VlcAudioPlayer();
        } else if (audioType.equalsIgnoreCase("MP4")) {
            advancedMediaPlayer=new Mp4AudioPlayer();

        }
    }

    @Override
    public void Play(String audioType,String fileName) {
        if(audioType.equalsIgnoreCase("VLC")){
            advancedMediaPlayer.playVlc(audioType,fileName);
        } else if (audioType.equalsIgnoreCase("MP4")) {
            advancedMediaPlayer.playMp4(audioType,fileName);
        }

    }
}
