package ex38;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gianni Angelone
 */
import java.util.*;
import static ex38.evenNumbers.filterEvenNumbers;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String data = in.nextLine();
        String[] list = data.split(" ");
        Integer[] evenList = filterEvenNumbers(list); //Our function to filter out the even numbers
        System.out.print("The even numbers are ");
        for (int i = 0; i < evenList.length; i++) {  //Here we print out our results of even numbers.
            if (i < evenList.length - 1) {
                System.out.print(evenList[i] + " ");
            } else {
                System.out.print(evenList[i] + ".");
            }
        }
    }
}




