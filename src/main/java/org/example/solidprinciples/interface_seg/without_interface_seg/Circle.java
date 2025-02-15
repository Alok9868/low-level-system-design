package org.example.solidprinciples.interface_seg.without_interface_seg;

public class Circle implements ShapeInterface{

    // Here we have single interface which have both area and volume
    // but for circle there is no vol , but we are forcing circle to calculate vol
    // this is wrong
    @Override
    public void calcArea() {

    }

    @Override
    public void calcVol() {

    }
}
