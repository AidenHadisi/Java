/*
 * Hadisi, Aiden
 * CS A170
 * February 10, 2017
 * IC #03 Change Maker
 */
import java.util.Scanner;

public class ChangeMaker
{

    public static void main(String[] args)
    {
        int cents, quarters, dimes, nickels, pennies;
        Scanner consoleScanner = new Scanner(System.in);
        System.out.println("Enter a whole number from 1 to 99\nI will find a combination of coins to equal that amount of change.");
        cents = consoleScanner.nextInt();
        System.out.println(cents+" cents in coins can be given as:");
        quarters = cents/25;
        cents = cents%25;
        dimes = cents/10;
        cents = cents%10;
        nickels = cents/5;
        pennies = cents%5;
        
        System.out.println(quarters+" quarter(s)");
        System.out.println(dimes+" dime(s)");
        System.out.println(nickels+" nickel(s)");
        System.out.println(pennies+" pennie(s)");
        
        consoleScanner.close();
        
      

    }

}
