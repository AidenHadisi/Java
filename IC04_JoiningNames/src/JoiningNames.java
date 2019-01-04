import java.util.Scanner;

/*
 * Hadisi, Aiden
 * CS A170
 * February 19, 2017
 * IC #04 Joining Names
 */
public class JoiningNames
{

    public static void main(String[] args)
    {
    	String first, middle, last;
    	Scanner consoleScanner = new Scanner(System.in);
    	System.out.print("Please enter your first name: ");
    	first = consoleScanner.nextLine();
    	System.out.print("Please enter your middle initial: ");
    	middle = consoleScanner.nextLine();
    	System.out.print("Please enter your last name: ");
    	last = consoleScanner.nextLine();
    	consoleScanner.close();
    	System.out.println(first+"(length = "+first.length()+')');
    	System.out.println(middle+"(length = "+middle.length()+')');
    	System.out.println(last+"(length = "+last.length()+')');
    	System.out.println();
    	System.out.println(last.toUpperCase()+','+first.toUpperCase()+','+middle.toUpperCase());

    }

}
