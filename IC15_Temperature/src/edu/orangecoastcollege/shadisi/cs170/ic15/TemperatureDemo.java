package edu.orangecoastcollege.shadisi.cs170.ic15;

public class TemperatureDemo {

	public static void main(String[] args) {

		Temperature now = new Temperature(25, TemperatureUnit.CELSIUS);
		System.out.println(now);
		
		Temperature de = new Temperature();
		System.out.println(de);
		
		now.inOtherUnit(TemperatureUnit.FAHRENHEIT);
		System.out.println(now);
	}

}
