package edu.orangecoastcollege.shadsi.cs170.ic12;

public class CreditCardDemo
{

    public static void main(String[] args)
    {
        // Now we want to make two credit cards
        // You have to use the same order that you used in the constructor
        CreditCard platinum = new CreditCard(CardNetwork.VISA, "Aiden Hadisi", "1234567812345678", "12/19", 123);
        System.out.println(platinum);
        CreditCard bofa = new CreditCard(CardNetwork.VISA, "Name", "1234567891234567", "12/13", 123);
        System.out.println(bofa);

    }

}
