import java.text.NumberFormat;
import java.util.Scanner;

public class Tipping {

	public static void main(String[] args) {
		double bill, tipPercent, tax, tipAmount, total;
		Scanner consoleScanner = new Scanner(System.in);
		NumberFormat Currency = NumberFormat.getCurrencyInstance();
		System.out.print("Please enter the amount of restaurant bill: $");
		bill = consoleScanner.nextInt();
		System.out.print("Please enter the tip percentage (%)");
		tipPercent = consoleScanner.nextInt();
		tax = bill*0.08;
		System.out.println("\nThe totall taxes are "+Currency.format(tax));
		tipAmount = (bill*tipPercent)/100;
		System.out.println("The tip amount is "+Currency.format(tipAmount));
		total = bill+tax+tipAmount;
		System.out.print("\nThe total amount to pay is "+Currency.format(total));
		consoleScanner.close();
		

	}

}
