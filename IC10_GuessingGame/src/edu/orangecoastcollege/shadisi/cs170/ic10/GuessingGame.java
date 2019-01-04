package edu.orangecoastcollege.shadisi.cs170.ic10;

import java.util.Random;
import java.util.Scanner;
/*
 * Hadisi, Aiden
 * CS A170
 * March 12, 2017
 * IC #10 Guessing Game
 */
public class GuessingGame
{

    public static void main(String[] args)
    {
        // We need to design a program that randomly generates a 5 digit number.
        // Then we let the user guess and program shows how many digits are correct and sum of corret digits.
        // the user wins when all 5 digits are the same as waht the program picked
        // We can't use a for loop because we don't knwo how many times the user will guess.
        // We also cannot use a while loop because we need at least one guess.
        // Therefore we can use a do/while loop
        
        int guess, numberDigitsCorrect, sumDigitsCorrect, attempts=0, answer;
        // We need to set all to zero except random answer and guess (input by use)
        Random rng = new Random();
        Scanner consoleScanner = new Scanner(System.in);
        
        // We need a do- while look that will keep going as long as the guess is not the same as the answer
        // You should put answer generator before the loop so it will only make up one number
        // If you put the answer generator inside the loop everytime user makes a guess the answer will change.
        
        // We want a random number between 10000 to 99999
        answer = rng.nextInt(90000)+10000;
        System.out.print(answer);
        // For inside () substract then add 1 (99999-10000+1)
        do {
            // We need to prompt the user to enter a guess
            // We need to use the mod to figure out which digits are correct.
            // To find g1 = guess / 10000 
            // g2 = guess % 10000 / 1000 (this will give the second digit)
            // g3 = guess % 10000 % 1000 / 100; ( This will give us the third digit)
            System.out.print("Please enter a 5-digit code (your guess):");
            guess = consoleScanner.nextInt();
            int g1 = guess / 10000;
            int g2 = guess % 10000 /1000;
            int g3 = guess % 10000 % 1000 / 100;
            int g4 = guess % 10000 % 1000 % 100 / 10;
            int g5 = guess % 10000 % 1000 % 100 % 10;
            int a1 = answer / 10000;
            int a2 = answer % 10000 /1000;
            int a3 = answer % 10000 % 1000 / 100;
            int a4 = answer % 10000 % 1000 % 100 / 10;
            int a5 = answer % 10000 % 1000 % 100 % 10;
            numberDigitsCorrect = 0;
            sumDigitsCorrect =0;
            if (g1 == a1)
            {
                numberDigitsCorrect ++;
                sumDigitsCorrect += a1;
            }
            if (g2 == a2)
            {
                numberDigitsCorrect ++;
                sumDigitsCorrect += a2;
            }
            if (g3 == a3)
            {
                numberDigitsCorrect ++;
                sumDigitsCorrect += a3;
            }
            if (g4 == a4)
            {
                numberDigitsCorrect ++;
                sumDigitsCorrect += a4;
            }
            if (g5 == a5)
            {
                numberDigitsCorrect ++;
                sumDigitsCorrect += a5;
            }
            attempts++;
          System.out.println("Number of digits correct: "+ numberDigitsCorrect);
          System.out.println("Sum of digits correct: " + sumDigitsCorrect);
          System.out.println();
            // Do the same for the answer
        }while(guess != answer);
        consoleScanner.close();
        System.out.println("****HOORAY!  You solved it.  You are so smart****");
        System.out.println("In " + attempts + " attempts.");

    }

}
