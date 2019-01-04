package edu.orangecoastcollege.shadisi.cs170.ic13;

import java.text.NumberFormat;

public class GradeDistribution
{
    private int mNumberAs, mNumberBs, mNumberCs, mNumberDs, mNumberFs;
    NumberFormat percentage = NumberFormat.getPercentInstance();
    
    public void setAllGrades(int numberAs, int numberBs, int numberCs, int numberDs, int numberFs)
    {
        mNumberAs = numberAs;
        mNumberBs = numberBs;
        mNumberCs = numberCs;
        mNumberDs = numberDs;
        mNumberFs = numberFs;
    }
    public void setNumberAs (int numberAs)
    {
        mNumberAs = numberAs;
        
    }
    public void setNumberBs (int numberBs)
    {
        mNumberBs = numberBs;
    }
    public void setNumberCs (int numberCs)
    {
        mNumberCs = numberCs;
    }
    public void setNumberDs(int numberDs)
    {
        mNumberDs = numberDs;
    }
    public void setNumberFs(int numberFs)
    {
        mNumberFs = numberFs;
    }
    public double getNumberOfGrades()
    {
        return mNumberAs + mNumberBs + mNumberCs + mNumberDs + mNumberFs;
    }
    public double getPercentAs()
    {
        
        return (mNumberAs/getNumberOfGrades() * 100.0);
    }
    public double getPercentBs()
    {
        return (mNumberBs/getNumberOfGrades()* 100.0);
    }
    public double getPercentCs()
    {
        return (mNumberCs/getNumberOfGrades() * 100.0);
    }
    public double getPercentDs()
    {
        return (mNumberDs/getNumberOfGrades() * 100.0);
               
    }
    public double getPercentFs()
    {
        return (mNumberFs/getNumberOfGrades()*100.0);
    }

}
