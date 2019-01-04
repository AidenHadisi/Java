package edu.orangecoastcollege.shadisi.cs170.ic13;

public class PointLineDemo
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        // Create 2 to 3 objects.
        // Make 3 points 3 different ways:
        // Point p1 at (3, 4) using Parameterized constructor
        Point p1 = new Point(3, 4);
        // Point p2 at (0, 0) Using default constructor
        Point p2 = new Point();
        // point p3 as a copy of p1 Using a copy costructor. p1 becomes the
        // other point.
        Point p3 = new Point(p1);
        // This copies all the P1 values to the p3
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // Test for equality before testing mutators and accessors
        if (p1.equals(p3))
            System.out.println("The points are the same.");
        else
            System.out.println("The points are different.");

        // Lets test the mutators
        // Cahnge p3 to be (1, 2) instead of (3, 4)
        p3.setX(1);
        p3.setY(2);
        System.out.println("New p3:\n" + p3);
        if (p1.equals(p3))
            System.out.println("The points are the same.");
        else
            System.out.println("The points are different.");
        
        // Test the miscelleneous methods
        System.out.println("The distance between p1 and p2 is " + p1.distanceTo(p2));

    }

}
