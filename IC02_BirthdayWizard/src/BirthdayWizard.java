import java.util.Scanner;

public class BirthdayWizard {

	public static void main(String[] args) {
		int year, age, ageA, futureYear;
		Scanner consoleScanner = new Scanner(System.in);
		System.out.println("Please enter your birth year ...");
		year = consoleScanner.nextInt();
		age = (2017-year);
		System.out.println("You are "+ age +" years old.");
		System.out.println("Please enter a future age ...");
		ageA = consoleScanner.nextInt();
		futureYear = 2017+(ageA-age);
		System.out.println("You will be " + ageA + " in the year "+futureYear );
		consoleScanner.close();
		

	}

}
