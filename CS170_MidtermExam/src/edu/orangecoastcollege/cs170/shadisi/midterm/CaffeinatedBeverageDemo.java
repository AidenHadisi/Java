package edu.orangecoastcollege.cs170.shadisi.midterm;

/*
 * Hadisi, Aiden
 * CS A170
 * March 24, 2017
 * MidTerm Exam
 */
public class CaffeinatedBeverageDemo
{

    public static void main(String[] args)
    {

        CaffeinatedBeverage coffee = new CaffeinatedBeverage("Starbucks", "Blonde Roast", BevType.COFFEE, 275.0, 12);
        CaffeinatedBeverage soda = new CaffeinatedBeverage(coffee);

        System.out.println(coffee);
        System.out.println(soda);

        if (coffee.equals(soda))
            System.out.println("Both beverages are the same.");
        else
            System.out.println("The beverages are different.");

        System.out.println();

        soda.setCompany("Pepsi");
        soda.setName("Max");
        soda.setType(BevType.SODA);
        soda.removeCaffeine(205);
        soda.setSize(20);

        System.out.println(coffee);
        System.out.println(soda);

        if (coffee.equals(soda))
            System.out.println("Both beverages are the same.");
        else
            System.out.println("The beverages are different.");

        System.out.println();

        System.out.println("~~~Adding 1 mg Coffeine to both Beverages~~~");

        coffee.addCaffeine(1);
        soda.addCaffeine(1);

        System.out.println();

        System.out.println("~~~Adding 200 mg Caffeine to both Beverages~~~");

        coffee.addCaffeine(200);
        soda.addCaffeine(200);

        System.out.println(coffee);
        System.out.println(soda);

        System.out.println();

        System.out.println("~~~Removing 200 mg Caffeine from both Beverages~~~");

        coffee.removeCaffeine(200);
        soda.removeCaffeine(200);

        System.out.println(coffee);
        System.out.println(soda);
    }

}
