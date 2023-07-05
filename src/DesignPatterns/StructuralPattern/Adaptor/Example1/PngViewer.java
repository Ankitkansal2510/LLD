package DesignPatterns.StructuralPattern.Adaptor.Example1;

public class PngViewer implements AdvanceImageViewer {
    @Override
    public void showPng() {
        System.out.println("PNG Viewer");
    }

    @Override
    public void showJpg() {

    }
}
