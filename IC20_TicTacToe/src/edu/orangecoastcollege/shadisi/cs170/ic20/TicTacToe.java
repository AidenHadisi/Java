package edu.orangecoastcollege.shadisi.cs170.ic20;

import java.util.Scanner;
/*
 * Hadisi, Aiden
 * CS A170
 * April 21, 2017  
 * IC #20 TicTacToe
 */
public class TicTacToe
{
    public static final int ROWS = 3;
    public static final int COLS = 3;

    public static void main(String[] args)
    {
        Scanner consoleScanner = new Scanner(System.in);
        char[][] board = new char [ROWS][COLS];
        int userRow, userCol, moves = 0;
        // looping throught a multi dimensional array, use nested for loops 
        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                board [row][col] = '*';
            }
        }
        do{
            printBoard(board);
            
            System.out.print("Please enter row: ");
            userRow = consoleScanner.nextInt()-1;
            System.out.print("Please enter col: ");
            userCol = consoleScanner.nextInt()-1;
            if(board[userRow][userCol] == '*')
                board[userRow][userCol] = ((moves%2 == 0) ? 'X' : 'O');
            else
                System.out.println("Cheater!");
            //check for a win 
            if((board[0][0] != '*' && board[0][0] == board[0][1] && board[0][1] == board[0][2]) ||
                    (board[1][0] != '*' && board[1][0] == board[1][1] && board[1][1] == board[1][2]) ||
                    (board[2][0] != '*' && board[2][0] == board[2][1] && board[2][1] == board[2][2]) ||
                    (board[0][0] != '*' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) ||
                    (board[0][2] != '*' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) ||
                    (board[0][0] != '*' && board[0][0] == board[1][0] && board[1][0] == board[2][0]) ||
                    (board[0][1] != '*' && board[0][1] == board[1][1] && board[1][1] == board[2][1]))
            {
            	if(moves % 2 == 0)
            		System.out.println("Player 1 won.");
            	else
            		System.out.println("Playeer 2 won.");
            	  printBoard(board);
            	break;
            }
            moves++;
        }while(moves < 9);
        consoleScanner.close();
    }
    
    //Make a method to print the board 
    public static void printBoard(char[][] board)
    {
        System.out.println("-------------");
        for(int row = 0; row < ROWS; row++)
        {
            System.out.print("| ");
            for(int col = 0; col < COLS; col++)
            {
                System.out.print(board[row][col]+" | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

}
