package DesignPatterns.StructuralPattern.Adaptor.Example1;
/***
 * The adaptor design pattern is a structural design patter . This is also known as the wrapper design patter
 * This design pattern act as a bridge between two interfaces .It can convert the interface of
 * one class to make it compatible with a client who is expecting the different interface
 *
 * **/
public class GalleryApp implements ImageViewer {

    ImageAdaptor imageAdaptor;

    @Override
    public void show(String fileFormat) {
        if ("JPEG".equalsIgnoreCase(fileFormat)) {
            System.out.println("JPEG FILE FORMAT");
        } else if ("Png".equalsIgnoreCase(fileFormat)) {
            imageAdaptor = new ImageAdaptor(fileFormat);
            imageAdaptor.show(fileFormat);
        } else if ("Jpg".equalsIgnoreCase(fileFormat)) {
            imageAdaptor = new ImageAdaptor(fileFormat);
            imageAdaptor.show(fileFormat);
        }
    }
}
