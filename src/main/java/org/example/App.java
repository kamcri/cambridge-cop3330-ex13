/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package org.example;
import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principle: ");
        double principle = sc.nextFloat();
        System.out.println("Enter rate of interest(%): ");
        double rate = sc.nextFloat();
        double newRate = rate / 100;
        System.out.println("Enter the number of years: ");
        double years = sc.nextFloat();
        System.out.println("What is the number of times the interest is compounded per year?");
        double compound = sc.nextFloat();

        sc.close();

        double interest = principle * Math.pow(1 + (newRate/compound), compound * years);
        System.out.printf("$%.2f invested at %.2f%% for %.0f years compounded %.0f times per year is $%.2f", principle,
                           rate, years, compound, interest);
    }
}
