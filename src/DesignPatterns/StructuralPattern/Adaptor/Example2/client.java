package DesignPatterns.StructuralPattern.Adaptor.Example2;

public class client {
    public static void main(String[] args) {
        AudioPlayer audioPlayer=new AudioPlayer();
        audioPlayer.Play("MP3","Dhoom.mp3");

        AudioPlayer vlcAudioPlayer=new AudioPlayer();
        vlcAudioPlayer.Play("VLC","josh.vlc");

        AudioPlayer Mp4AudioPlayer=new AudioPlayer();
        Mp4AudioPlayer.Play("MP4","Sakoon.mp4");

    }
}
