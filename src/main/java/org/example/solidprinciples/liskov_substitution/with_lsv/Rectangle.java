package org.example.solidprinciples.liskov_substitution.with_lsv;

public class Rectangle implements Shape {

    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(int h)
    {
        this.height=h;
    }

    public void setWidth(int w)
    {
        this.width=w;
    }

    @Override
    public long findArea()
    {
        return (long) this.height * this.width;
    }

}
