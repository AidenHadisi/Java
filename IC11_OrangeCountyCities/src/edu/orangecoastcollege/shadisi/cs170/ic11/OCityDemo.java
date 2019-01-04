package edu.orangecoastcollege.shadisi.cs170.ic11;

import java.util.Scanner;
/*
 * Hadisi, Aiden
 * CS A170
 * March 16, 2017
 * CS #11 Orange County Cities 
 */
public class OCityDemo
{

    public static void main(String[] args)
    {
        boolean livesInOc = false;
        // We have to start at false because we don't have an input yet
        // Now we have to define the variables to ask user where they live.
        String city;
        Scanner consoleScanner = new Scanner(System.in);

        System.out.print("In what city do you live? ");

        // We have to use nextline because the city can be multiple words.
        // Now we have to make it upper case and change the spaces to
        // underscore.
        // replcae(' ', '_'); Changes the spaces to underscore no matter how
        // many spaces there are.
        city = consoleScanner.nextLine().toUpperCase().replace(' ', '_');
        consoleScanner.close();

        // We have to use a for loop to go through all the cities to see if the
        // input is in our list.
        // The data type of of the list is OCity that we created.
        for (OCity validCity : OCity.values())
        {
            // The valid city variable is OCity data type.
            // We have to change them to string in order to compare them to the
            // city input.
            if (city.equals(String.valueOf(validCity)))
            {
                // If it matches. change the boolean to true
                // We cannot use else loop because it compares each variable. If
                // they say Yorba Linda it will say you don't live 34 times and
                // at the end it wwill say you do live in oc
                // We have to use a boolean variabele on top.
                livesInOc = true;

                // We don't even need an else because we started the boolean
                // with false and it will only change to true if it finds a
                // match.
                // Very common startegy: start with false and change it to true
                // if you find a match.
                // We don't need to keep searching if we find a match. We have
                // to stop the loop by using break; .
                break;
            }
            // After we finished the loop we need print the message.

        }
        if (livesInOc)
            System.out.println("You live in OC!");
        // we don't need to say equal to true because the booleab is already
        // true if we want to say false we just put !livesInOC
        else
            System.out.println("You don't live in OC! You have a winter!");
    }

}
