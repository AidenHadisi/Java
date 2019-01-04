import java.text.NumberFormat;
import java.util.Scanner;

/*
 * Hadisi, Aiden
 * CS A170
 * February 10, 2017
 * IC #03 Mortgage Payment
 */
public class MortgagePayment {

	public static void main(String[] args) {
		double payment, balance, interest, principle, rate;
		Scanner consoleScanner = new Scanner(System.in);
		NumberFormat Currency = NumberFormat.getCurrencyInstance();
		System.out.print("Please enter your mortgage payment: $");
		payment = consoleScanner.nextDouble();
		System.out.print("Please enter outstanding balance on mortgage: $");
		balance = consoleScanner.nextDouble();
		System.out.println("\nOf your "+Currency.format(payment)+" mortgage payment:");
		rate = 0.04/12;
		interest = balance*rate;
		System.out.println(Currency.format(interest)+" goes to interest.");
		principle = payment-interest;
		System.out.println(Currency.format(principle)+" goes to principle.");
		consoleScanner.close();
		

	}

}
