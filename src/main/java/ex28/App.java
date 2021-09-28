package ex28;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gianni Angelone
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        int count = 0;
        int sum = 0;
        while(count < 5){ //Grabs 5 numbers from the user, range 0-4; 5 total
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int a1 = input.nextInt();
            sum = sum + a1;
            count++; //Counter increments to keep track of how many numbers are added
        }
        System.out.print("The total is " + sum + ".");
    }
}
