package org.example.solidprinciples.liskov_substitution.with_lsv;

public class Square implements Shape {

    // In this case , We have created a interface Shape and define a function there to find area ,
    // now square and rectangle can be substituted in place of shape , and it will not violates
    // lsv principle.

    int height;
    int width;

    public Square(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int h) {
        this.height = h;
        this.width = h;
    }

    public void setWidth(int w) {
        this.height = w;
        this.width = w;
    }

    @Override
    public long findArea() {
        return (long) this.height * this.width;
    }


}
