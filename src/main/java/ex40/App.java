package ex40;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gianni Angelone
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a search string: ");
        String data = in.nextLine();
        System.out.print("Results: \r\n");
        System.out.print("Name              | Position              | Separation Date\r\n");
        System.out.print("-----------------------------------------------------------\r\n"); //Printing out the organized chart.
    }
}
