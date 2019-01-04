package edu.orangecoastcollege.shadisi.cs170.ic20;

import java.util.Scanner;

/*
 * Hadisi, Aiden
 * CS A170
 * April 21, 2017
 * IC #20 Palindrome
 */
public class Palindrome
{

    public static void main(String[] args)
    {
        String original, reverse, copy;
        Scanner consoleScanner = new Scanner(System.in);
        do{
            reverse = "";
            System.out.print("Please enter word or phrase to see if it's a palindrome(Type quit to end the program): ");
            // But we have to account for the spaces between characters
            original = consoleScanner.nextLine();
            copy = original;
            original = original.replace(" ", "");
            for(int i = original.length()-1; i >= 0; i--)
            {
                reverse += original.charAt(i);
            }
            if(original.equalsIgnoreCase(reverse))
                System.out.println(copy + " is a palindrome.");
            else if(original.equalsIgnoreCase("quit"))
                System.out.println("Thank you, goodbye.");
            else
                System.out.println(copy + " is not a palindrome :(");
            
        }while(!original.equalsIgnoreCase("quit"));
        consoleScanner.close();
        
    }

}
