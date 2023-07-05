package DesignPatterns.StructuralPattern.Adaptor.Example1;

public class jpgViewer implements AdvanceImageViewer{
    @Override
    public void showPng() {

    }

    @Override
    public void showJpg() {
        System.out.println("Jpg viewer");
    }
}
