package ex36;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gianni Angelone
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

import static ex36.Math.*;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        String userInput;
        do {
            System.out.print("Enter a number: "); //Enters a number
            userInput = input.next();
            if(!userInput.equals("done")) {
                try {
                    int number = Integer.parseInt(userInput);
                    numbers.add(number);
                }catch(NumberFormatException nfe) {
                    //No numbers are added.
                }
            }
        } while(!userInput.equals("done"));
        System.out.println("Numbers: "+numbers.stream().map(String::valueOf).collect(Collectors.joining(",")));
        System.out.println("The average is " + average(numbers));
        System.out.println("The minimum is " + min(numbers));
        System.out.println("The maximum is " + max(numbers));
        System.out.println("The standard deviation is "+ String.format("%.2f", std(numbers)));
        }
}
