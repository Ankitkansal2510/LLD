package DesignPatterns.StructuralPattern.Adaptor.Example1;
/**
 * Adaptor design pattern acts as a bridge between twon interfaces.
 * In this design pattern suppose we have a functionality of using JPEG format, but clients
 * also want to see PNG and JPG so without changing the client call we are giving the functionality
 * to support other formats as well
 * **/
public class Client {
    public static void main(String[] args) {
        GalleryApp galleryApp=new GalleryApp();
        galleryApp.show("JPEG");
        galleryApp.show("Png");
        galleryApp.show("Jpg");
    }
}
