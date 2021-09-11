/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Meola
 */

package org.example;
import java.util.Date;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        Date d=new Date();
        int year=d.getYear();
        int currentYear=year+1900;

        int age;
        int retirementAge;
        int difference;
        int retirementYear;

        System.out.println("What is your current age?");
        age = scan.nextInt();

        System.out.println("At what would you like to retire?");
        retirementAge = scan.nextInt();

        difference = retirementAge - age;
        retirementYear = currentYear + difference;

        System.out.println("You are " + age + ", you want to retire at " + retirementAge + "." );

        System.out.println( "It's " + currentYear + ", so you can retire in " + retirementYear + ".");

    }
}
