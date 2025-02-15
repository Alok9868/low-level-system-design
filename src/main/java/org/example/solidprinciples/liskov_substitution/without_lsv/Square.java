package org.example.solidprinciples.liskov_substitution.without_lsv;

public class Square extends Rectangle{

    // In this case , when using square in place of rectangle , the behaviour of rectangle
    // will change bcz height and width will become same , which is not intended.

    @Override
    public void setHeight(int h)
    {
        this.height=h;
        this.width=h;
    }

    @Override
    public void setWidth(int w)
    {
        this.height=w;
        this.width=w;
    }

    public long findArea()
    {
        return (long) this.height *this.width;
    }

}
