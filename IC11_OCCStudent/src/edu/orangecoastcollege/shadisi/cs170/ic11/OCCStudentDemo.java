package edu.orangecoastcollege.shadisi.cs170.ic11;
/*
 * Hadisi, Aiden
 * CS A170
 * March 16, 2017
 * CS #11 OCC Student
 */
public class OCCStudentDemo {
	public static void main(String[] args) {

		// Use constructor to make a brand new
		// object representing ourself
		OCCStudent me = new OCCStudent("C02495724", "shadisi", "Aiden Hadisi", 21, 3.9);
		OCCStudent bart = new OCCStudent("C123457", "bsimpson", "Bart Simpson", 36, 0.1);

		System.out.println(me);
		System.out.println(bart);

		if (me.equals(bart))
			// Java goes to OCCStudent looks for equal method and bart because
			// the otherStudent
			// You can put anything in OCCStudent place. ()
			// It is going to compare everyting.
			System.out.println("I am the same as Bart Simpson.");
		else
			System.out.println("I am NOT the same as Bart Simpson.");
		if (me.isOlder(bart))
			System.out.println("I am older than Bart Simpson.");
		else
			System.out.println("I am NOT older than Bart Simpson");
		if (me.isYounger(bart))
			System.out.println("I am younger than Bart Simpson.");
		else
			System.out.println("I am NOT younger than Bart Simpson.");
		if (me.isSameAge(bart))
			System.out.println("I am the same age as Bart Simpson.");
		System.out.println(me.getFullName() + "\n" + me.getGPA());

	}

}
