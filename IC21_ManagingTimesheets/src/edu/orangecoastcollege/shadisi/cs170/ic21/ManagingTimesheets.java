package edu.orangecoastcollege.shadisi.cs170.ic21;

import java.util.Scanner;
/*
 * Hadisi, Aiden
 * CS A170
 * April 26, 2017
 * IC #21 ManagingTimeSheets
 */
public class ManagingTimesheets
{

    public static final int EMPLOYEES = 3;
    public static final int DAYS = 5;

    public static void main(String[] args)
    {

        double total;
        Scanner consoleScanner = new Scanner(System.in);
        String[] weekdays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
        double[][] timesheet = new double[EMPLOYEES][DAYS];
        for (int row = 0; row < EMPLOYEES; row++)
        {
            for (int col = 0; col < DAYS; col++)
            {
                System.out.print("Please enter hours worked for employee #" + (row + 1) + " on " + weekdays[col] + ": ");
                timesheet[row][col] = consoleScanner.nextDouble();
                
            }
            System.out.println();
        }
        consoleScanner.close();
        // Lets use a for-each loop for the second part to calculate the total and average for each employee
        int count = 1;
        for(double[] employees : timesheet)
        {
            total = 0.0;
            for(double hours : employees)
            {
                total += hours;
            }
            System.out.println("Total hours worked for employee #" + count + ": " + total);
            System.out.println("Average hours worked for employee #" + count + ": " + total/DAYS);
            System.out.println();
            count++;
        }
        
     

    }

}
