package edu.orangecoastcollege.shadisi.cs170.ic13;

/*
 * Hadisi, Aiden
 * CS 170
 * March 17, 2017
 * IC #13 Get to the Point
 */
public class Point
{
    // first thing is usually the member variables-data to store
    private int mX;
    private int mY;

    // After the member variables we use parameterized constructor
    public Point(int x, int y)
    {
        mX = x;
        mY = y;
    }

    // Default constructor
    public Point()
    {
        // We set the default points. Default values for x and y are (0, 0)
        mX = 0;
        mY = 0;
    }

    // copy constructor
    public Point(Point otherPoint)
    {
        // We want to make a copy of other point.
        mX = otherPoint.mX;
        mY = otherPoint.mY;
    }

    public boolean equals(Point otherPoint)
    {
        // In order to see if two points are equal. We already are in one point
        // and we need another point to compare.
        // We use == because these are just integer values.
        if (mX == otherPoint.mX && mY == otherPoint.mY)
            return true;
        else
            return false;
    }

    public String toString()
    {
        return "Point [x=" + mX + ", y=" + mY + "]";
    }

    public double distanceTo(Point otherPoint)
    {
        // We use double because we have a squareroot and will get a decimal
        // point
        // In order to claculate the distance we need another point.
        // We want to convert the distance formula into the Java code.
        // Lets first make a variable to just store the (x2- x1)^2
        // In order to score it we use Math.pow(base, power);
        // We define local variables: These are local to the distanceTo
        double dx2 = Math.pow(otherPoint.mX - mX, 2);
        double dy2 = Math.pow(otherPoint.mY - mY, 2);
        double distance = Math.sqrt(dx2 + dy2);
        return distance;
    }

    public int getX()
    {
        return mX;
    }

    public int getY()
    {
        return mY;
    }

    public void setX(int x)
    {
        mX = x;
    }

    public void setY(int y)
    {
        mY = y;
    }

}
