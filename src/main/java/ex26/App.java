package ex26;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gianni Angelone
 */
import java.util.Scanner;
import static ex26.PaymentCalculator.UntilPaidOff;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your balance? "); //Read in balance
        double b = input.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? "); //The percentage is input
        double apr = input.nextDouble();
        System.out.print("What is the monthly payment you can make? "); //Read in input of monthly payment
        double p = input.nextDouble();

        System.out.print("It will take you " + UntilPaidOff(b,apr,p) + " months to pay off this card.");
    }
}
