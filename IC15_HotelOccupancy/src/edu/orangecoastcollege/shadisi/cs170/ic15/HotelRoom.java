package edu.orangecoastcollege.shadisi.cs170.ic15;
/*
 * Hadisi, Aiden
 * CS A170
 * April 11, 2017
 * IC #15 Hotel Room
 */
public class HotelRoom
{
    private int mRoomNumber;
    private int mPeopleInRoom;
    // Make the static variable -- One for the whole class
    // All objects share this one variable
    private static int sTotalOccupancy = 0;
    
    // constructor:
    public HotelRoom(int roomNumber, int peopleInRoom)
    {
        //check for illegal arguments 
        
        addToRoom(peopleInRoom);
        mRoomNumber = roomNumber;
        
    }

    public int getRoomNumber()
    {
        return mRoomNumber;
    }

    public void addToRoom(int number)
    {
        if (mPeopleInRoom + number > 4 || number < 0 )
            throw new IllegalArgumentException("Number of people in the room cannot exceed 4.");
        mPeopleInRoom += number;
        sTotalOccupancy += number;
    }

    public int getPeopleInRoom()
    {
        return mPeopleInRoom;
    }

    public void removeFromRoom(int number)
    {
        if(number < 0 || mPeopleInRoom-number < 0)
            throw new IllegalArgumentException("Number of people in the room cannot be below 0.");
        mPeopleInRoom -= number;
        sTotalOccupancy -= number;
       
    }
    public static int getOccupancy()
    {
        return sTotalOccupancy;
    }

	@Override
	public String toString() {
		return "HotelRoom [Room Number=" + mRoomNumber + ", People In Room=" + mPeopleInRoom + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mPeopleInRoom;
		result = prime * result + mRoomNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotelRoom other = (HotelRoom) obj;
		if (mPeopleInRoom != other.mPeopleInRoom)
			return false;
		if (mRoomNumber != other.mRoomNumber)
			return false;
		return true;
	}
    

}
