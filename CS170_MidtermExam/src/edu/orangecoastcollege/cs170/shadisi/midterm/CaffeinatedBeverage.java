package edu.orangecoastcollege.cs170.shadisi.midterm;

/*
 * Hadisi, Aiden
 * CS A170
 * March 24, 2017
 * MidTerm Exam
 */
public class CaffeinatedBeverage
{
    private String mCompany;
    private String mName;
    private BevType mType;
    private double mCaffeine;
    private int mSize;

    public CaffeinatedBeverage(String company, String name, BevType type, double caffeine, int size)
    {
        mCompany = company;
        mName = name;
        mType = type;
        mCaffeine = caffeine;
        mSize = size;
    }

    public CaffeinatedBeverage(CaffeinatedBeverage otherCaffeinatedBeverage)
    {
        mCompany = otherCaffeinatedBeverage.mCompany;
        mName = otherCaffeinatedBeverage.mName;
        mType = otherCaffeinatedBeverage.mType;
        mCaffeine = otherCaffeinatedBeverage.mCaffeine;
        mSize = otherCaffeinatedBeverage.mSize;
    }

    public boolean equals(CaffeinatedBeverage otherCaffeinatedBeverage)
    {
        if (mCompany.equalsIgnoreCase(otherCaffeinatedBeverage.mCompany)
                && mName.equalsIgnoreCase(otherCaffeinatedBeverage.mName)
                && mType.equals(otherCaffeinatedBeverage.mType) && mCaffeine == otherCaffeinatedBeverage.mCaffeine
                && mSize == otherCaffeinatedBeverage.mSize)
            return true;
        else
            return false;
    }

    public String getCompany()
    {
        return mCompany;
    }

    public String getName()
    {
        return mName;
    }

    public BevType getType()
    {
        return mType;
    }

    public double getCaffeine()
    {
        return mCaffeine;
    }

    public int getSize()
    {
        return mSize;
    }

    public void setCompany(String company)
    {
        mCompany = company;
    }

    public void setName(String name)
    {
        mName = name;
    }

    public void setType(BevType type)
    {
        mType = type;
    }

    public void setSize(int size)
    {
        mSize = size;
    }

    public String toString()
    {
        return "CaffeinatedBeverage [Company=" + mCompany + ", Name=" + mName + ", Type=" + mType + ", Caffeine="
                + mCaffeine + " mg, Size=" + mSize + " oz]";

    }

    public boolean addCaffeine(int amount)
    {
        if (mType.equals(BevType.SODA) && (mCaffeine + amount) <= 71)
        {
            mCaffeine += amount;
            return true;

        }

        else if (mType.equals(BevType.COFFEE) && (mCaffeine + amount) <= 475)
        {
            mCaffeine += amount;
            return true;
        }
        else
            return false;
    }

    public boolean removeCaffeine(int amount)
    {
        if ((mCaffeine - amount) >= 0)
        {
            mCaffeine -= amount;
            return true;
        }
        else
            return false;

    }

}
