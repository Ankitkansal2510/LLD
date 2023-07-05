package DesignPatterns.StructuralPattern.Adaptor.Example1;

public class ImageAdaptor implements ImageViewer{

    AdvanceImageViewer advanceImageViewer;

    public ImageAdaptor(String fileFormat) {
        if("Png".equalsIgnoreCase(fileFormat)){
            advanceImageViewer=new PngViewer();
        }else if("Jpg".equalsIgnoreCase(fileFormat)){
            advanceImageViewer=new jpgViewer();
        }
    }

    @Override
    public void show(String fileFormat) {
        if("Png".equalsIgnoreCase(fileFormat)){
            advanceImageViewer.showPng();
        }else if("Jpg".equalsIgnoreCase(fileFormat)){
            advanceImageViewer.showJpg();
        }
    }
}
