import java.util.Scanner;
/*
 * Hadisi, Aiden
 * CS A170
 * February 19, 2017
 * IC #04 Date Format
 */
public class DateFormat
{

    public static void main(String[] args)
    {
        Scanner consoleScanner = new Scanner(System.in);
        String date;
        System.out.println("Please enter the date (format MM/DD/YYYY) and include the forward slashes:");
        date = consoleScanner.next();        
        consoleScanner.close();

        String day = date.substring(3,5);
        String month = date.substring(0,2);
        String year = date.substring(6);
        System.out.println("In the European format, DD.MM.YYYY, this date is:\n"+day+'.'+month+'.'+year);
     
        

    }

}
