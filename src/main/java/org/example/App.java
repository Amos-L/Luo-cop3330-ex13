/*
 *  UCF COP3330 Fall 2021 Assignment 1.13 Solution
 *  Copyright 2021 Amos Luo
 */

package org.example;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner x = new Scanner(System.in);
        System.out.print("What is the principal amount? "); //Asking for user input
        double P = x.nextDouble(); //Storing user input
        System.out.print("What is the rate? ");
        double rate = x.nextDouble();
        System.out.print("What is the number of years? "); //Asking for user input
        double year = x.nextDouble(); //Storing user input
        System.out.print("What is the number of times the interest is compounded per year? "); //Asking for user input
        double numPounded = x.nextDouble(); //Storing user input

        double int_rate = rate/100;
        double total = P*Math.pow((1+int_rate/numPounded),numPounded*year); //Used to calculate the given formula

        double roundedtotal = Math.round(total * 100)/100.0; //rounding to the nearest penny
        NumberFormat currency = NumberFormat.getCurrencyInstance(); //Formats into currency
        DecimalFormat nodec = new DecimalFormat("#0"); //Takes 0's after double

        System.out.println(currency.format(P)+ " invested at " +rate+ "% for " +nodec.format(year)+ " years compounded " +nodec.format(numPounded)+ " times per year is " +currency.format(roundedtotal)+ ".");
    }
}