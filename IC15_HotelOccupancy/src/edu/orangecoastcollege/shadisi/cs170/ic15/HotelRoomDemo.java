package edu.orangecoastcollege.shadisi.cs170.ic15;
/*
 * Hadisi, Aiden
 * CS A170
 * April 11, 2017
 * IC #15 Hotel Room
 */
public class HotelRoomDemo
{

    public static void main(String[] args)
    {
        // Total Occupents is static so fot the class not each object
        // So put hotel room in front 
    	HotelRoom me = new HotelRoom(2001, 3);
    	System.out.println(me);
        System.out.println("Total Occupancy=" + HotelRoom.getOccupancy());
        me.addToRoom(1);
        System.out.println(me);
        me.removeFromRoom(2);
        System.out.println(me);
       System.out.println(HotelRoom.getOccupancy());
        

    }

}
