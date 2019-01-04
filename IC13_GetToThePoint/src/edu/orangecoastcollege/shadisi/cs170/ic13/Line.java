package edu.orangecoastcollege.shadisi.cs170.ic13;

public class Line
{
    // We are using points the we already defined in point class so we use point as data type
    // We use class composition. Line is composed of (has) two points. 
    private Point mP1;
    private Point mP2;
    public Line (int x1, int y1, int x2, int y2)
    {
        // We now need to store these 4 values into our 2 points.
        // We can use x1 and y1 to make a new point called mp1
        // We use the existing constuctor in Point.java to make a new point 
        mP1 = new Point(x1, y1);
        mP2 = new Point(x2, y2);
    }
    public Line (Point p1, Point p2)
    {
        mP1 = p1;
        mP2 = p2;
    }
    public Line (Line otherLine)
    {
        mP1 = otherLine.mP1;
        mP2 = otherLine.mP2;
    }
    public boolean equals (Line otherLine)
    {
        if (mP1 == otherLine.mP1 && mP2 == otherLine.mP2)
            return true;
        else 
            return false;
    }
    public Point getP1 ()
    {
        return mP1;
    }
    public Point getP2 ()
    {
        return mP2;
    }
    public int getX1 ()
    {
        return mP1.getX(); 
        // We have to use getX because mx and x are private to point class and are not visible to other classes 
  
    }
    public int getY1 ()
    {
        return mP1.getY();
    }
    public int getX2 ()
    {
        return mP2.getX();
    }
    public int getY2 ()
    {
        return mP2.getY();
    }
    public void setP1 (Point p1)
    {
        mP1 = p1;
    }
    public void setP2 (Point p2)
    {
        mP2 = p2;
    }
    public void setX1 (int x1)
    {
        mP1.setX(x1);
    }
    public void setY1 (int y1)
    {
        mP1.setX(y1);
    }

}
