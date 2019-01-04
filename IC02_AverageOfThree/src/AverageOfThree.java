import java.util.Scanner;

public class AverageOfThree
{

    public static void main(String[] args)
    {
        //Define Variables (data) first.
        int number1, number2, number3;
        double average;
        Scanner consoleScanner = new Scanner(System.in);
        System.out.print("Please enter number 1:");
        number1 = consoleScanner.nextInt();
        System.out.print("Please enter number 2:");
        number2 = consoleScanner.nextInt();
        System.out.print("Please enter number 3:");
       number3 = consoleScanner.nextInt();
       average = (number1+number2+number3)/3.0;
       System.out.println("The average of the three numbers is:"+average);
       consoleScanner.close();
       
       
        

    }

}
