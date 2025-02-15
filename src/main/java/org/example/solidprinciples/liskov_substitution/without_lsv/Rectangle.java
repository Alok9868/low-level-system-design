package org.example.solidprinciples.liskov_substitution.without_lsv;


public class Rectangle {

    int height;
    int width;

    public void setHeight(int h) {
        this.height = h;
    }

    public void setWidth(int w) {
        this.width = w;
    }

    public long findArea() {
        return (long) this.height * this.width;
    }

}
