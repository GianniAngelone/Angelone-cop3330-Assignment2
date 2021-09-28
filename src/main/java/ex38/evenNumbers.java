package ex38;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gianni Angelone
 */
import java.util.ArrayList;
public class evenNumbers {
    public static Integer[] filterEvenNumbers(String[] list) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (String s : list) {
            int num = Integer.parseInt(s);
            if (num % 2 == 0) {
                newList.add(num); //Checking if the numbers are divisible by mod 2, meaning it's a perfect even.
            }
        }
        Integer[] arr = new Integer[newList.size()];
        arr = newList.toArray(arr);
        return arr; //Returning new array with even numbers only.
    }
}


