package edu.orangecoastcollege.shadisi.cs170.ic11;
/*
 * Hadisi, Aiden
 * CS A170
 * March 16, 2017
 * CS #11 OCC Student
 */

public class OCCStudent
{
    // Member Variables - data we want to store about each object (student)
    private String mCNumber;
    private String mUserName;
    private String mFullName;
    private int mAge;
    private double mGPA;

    // They have an m because of convention but you do
    // Constructor method - creates (instantiates) a brand new object (Student)
    // Constructors are public, must have same name as class
    public OCCStudent(String cNumber, String userName, String fullName, int age, double gpa)
    {
        // Storing the public data into our private member variables (database)
        // These are the state of the class
        // Constructor has the same excat name as the class name.
        mCNumber = cNumber;
        mUserName = userName;
        mFullName = fullName;
        mAge = age;
        mGPA = gpa;
             
    }
    public String toString()
    {
    	String output = mCNumber + ", " + mUserName + ", " + mFullName + ", " + mAge + ", " + mGPA;
    	return output;
    }

    // Accessor (getter) methods - provide access to the values of member
    // variables
    // These are the behavior of the class:
    public String getCNumber()
    {
        // Go into database, return the value of mCNumber
        return mCNumber;
    }

    public String getUserName()
    {
        return mUserName;
    }

    public String getFullName()
    {
        return mFullName;
    }

    public double getGPA()
    {
        return mGPA;
    }

    // Mutators (setters) - change/modify the value of member variables:
    public void setFullName(String fullName)
    {
        // Store the new full name into our database (mFullName)
        mFullName = fullName;
    }

    public void setAge(int age)
    {
        mAge = age;
    }
    // Now we use miscellaneous methods to compare two students:
    // is older - compares one student to another to see if s/he is older

    // Miscellaneous Methods - behavior specific to the class
    public boolean isOlder(OCCStudent otherStudent)
    { // Whatever you put whitin the () is what you need in order for the method
      // to work

        // If our age is greater than other students age
        if (mAge > otherStudent.mAge)
            // The onswer is true (We're older)
            return true;
        else
            return false;
        // Other student is older
        // you have to type the else statement because the method needs a return

    }

    public boolean isYounger(OCCStudent otherStudent)
    {
        if (mAge < otherStudent.mAge)
            return true;
        else
            return false;
    }

    public boolean isSameAge(OCCStudent otherStudent)
    {
        if (mAge == otherStudent.mAge)
            return true;
        else
            return false;

    }

    // now find the equal method: In order for two students to be equal all
    // their info must match.
    // We want to check and make sure we don't have two of same info in database
    public boolean equals(OCCStudent otherStudent)
    {
        if (mCNumber.equalsIgnoreCase(otherStudent.mCNumber) && mFullName.equalsIgnoreCase(otherStudent.mFullName)
                && mUserName.equalsIgnoreCase(otherStudent.mUserName) && mGPA == otherStudent.mGPA
                && mAge == otherStudent.mAge)
            return true;
        else
            return false;
    }
}
