package edu.orangecoastcollege.shadisi.cs170.ic21;

import java.util.Scanner;

public class Sudoku
{

  
    // 1) solvedPuzzle - Solution (answer key) - constant
    public static final int[][] solvedPuzzle = {
            {9,7,4,8,3,5,2,1,6},
            {1,2,3,9,6,7,5,8,4},
            {8,6,5,4,2,1,9,7,3},
            {2,3,7,1,9,8,6,4,5},
            {4,8,1,2,5,6,7,3,9},
            {6,5,9,7,4,3,1,2,8},
            {7,9,8,5,1,4,3,6,2},
            {3,1,2,6,8,9,4,5,7},
            {5,4,6,3,7,2,8,9,1}
            };
    // 2) initialPuzzle - starting board. 0's represent empty spaces - constant
    public static final int[][] initialPuzzle = {
            {9,0,0,8,0,5,0,0,6},
            {1,0,3,0,0,0,5,0,4},
            {0,6,0,0,2,0,0,7,0},
            {0,0,7,1,0,8,6,0,0},
            {4,0,0,0,0,0,0,0,9},
            {0,0,9,7,0,3,1,0,0},
            {0,9,0,0,1,0,0,6,0},
            {3,0,2,0,0,0,4,0,7},
            {5,0,0,3,0,2,0,0,1}
            };
     // 3) workingPuzzle - represents the user's moves - changes based on user's input 
    public static final int ROWS = 9;
    public static final int COLS = 9;
    public static int[][] workingPuzzle = new int[ROWS][COLS];
    
        public static void main(String[] args)
        {
            resetPuzzle();
            printPuzzle();
            //Lets loop as long as the user does not type Q (quit):
            String choice="";
            int row, col, value;
            Scanner consoleScanner = new Scanner(System.in);
            do{
                System.out.println("What would you like to do?");
                System.out.println("Set a square (s), Reset puzzle (R) or Quit (Q)");
                choice = consoleScanner.next().toUpperCase();
                switch (choice)
                {
                    case "S":
                        //prompt for row and col value
                    	System.out.println("Which row (1 to 9) and which column (1 to 9): ");
                    	row = consoleScanner.nextInt();
                    	col = consoleScanner.nextInt();
                    	System.out.println("Please enter the value: ");
                    	value = consoleScanner.nextInt();
                        workingPuzzle[row][col] = value;
                        break;
                    case "R":
                    	resetPuzzle();
                        break;
                    case "Q":
                    	printPuzzle();
                    	System.exit(0);
                        break;
                }
            }while(!choice.equalsIgnoreCase("Q"));
            
                     
        }
        public static void resetPuzzle()
        {
         // Initialize everything in workingPuzzle to everything in initialPuzzle
         for(int row = 0; row < ROWS; row++)
         {
             for(int col = 0; col < COLS; col++)
             {
                 workingPuzzle[row][col] = initialPuzzle[row][col];
             }
         }
        }
        
        public static void printPuzzle()
        {
            System.out.println("  C 1  2  3  4  5  6  7  8  9");
            System.out.println("R  ---------------------------");
            for(int row = 0; row < ROWS; row++)
            {
                // #1
                System.out.print((row+1)+ " |");
                for(int col = 0; col < COLS; col++)
                {
                    // #2
                    System.out.print(workingPuzzle[row][col] == 0 ? " . " : " " +workingPuzzle[row][col] + " " );
                }
                // #3
                System.out.println();
            }
            // #4
        }

}
