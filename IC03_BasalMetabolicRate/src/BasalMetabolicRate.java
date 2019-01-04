/*
 * Hadisi, Aiden
 * CS A170
 * February 10, 2017
 * IC #03 Basal Metabolic Rate
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class BasalMetabolicRate
{

    public static void main(String[] args)
    {
       
        double weight, height, age, bmrF, bmrM, cBarsF, cBarsM;
        Scanner consoleScanner = new Scanner(System.in);
        DecimalFormat zeroDP = new DecimalFormat("#");
        DecimalFormat oneDP = new DecimalFormat("#.0");
        System.out.print("Please enter your weight (lb):");
        weight = consoleScanner.nextInt();
        System.out.print("Please enter your height (in):");
        height = consoleScanner.nextInt();
        System.out.print("Please enter your age:");
        age = consoleScanner.nextInt();
        bmrM = 66+(6.23*weight)+(12.7*height)-(6.8*age);
        bmrF = 655+(4.35*weight)+(4.7*height)-(4.7*age);
        System.out.println("\nBMR (Female):" + zeroDP.format(bmrF)+" calories");
        System.out.println("BMR (Male):"+zeroDP.format(bmrM)+" calories");
        cBarsF  = bmrF/230;
        cBarsM = bmrM/230;
        System.out.println("\nIf you are female, you need to consume "+oneDP.format(cBarsF)+" chocolate bars to maintain weight.");
        System.out.println("If you are male, you need to consume "+oneDP.format(cBarsM)+" chocolate bars to maintain weight.");
        
        consoleScanner.close();

    }

}
