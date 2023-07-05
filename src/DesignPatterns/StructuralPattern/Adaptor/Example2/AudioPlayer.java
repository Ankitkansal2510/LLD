package DesignPatterns.StructuralPattern.Adaptor.Example2;

public class AudioPlayer implements MediaPlayer{

    MediaAdaptor mediaAdaptor;


    @Override
    public void Play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("MP3")){
            System.out.println("Playing " + audioType + " " +  "with filename : " + fileName);
        }else if(audioType.equalsIgnoreCase("VLC") ||
                    audioType.equalsIgnoreCase("MP4")){
            mediaAdaptor=new MediaAdaptor(audioType);
            mediaAdaptor.Play(audioType,fileName);
        }
    }
}
