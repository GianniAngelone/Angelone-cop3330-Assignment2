package ex24;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gianni Angelone
 */
import java.util.Scanner;
import static ex24.checkAnagram.isAnagram;
public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two strings and I'll tell you if they are anagrams:" + "\r\n" + "Enter the first string: ");
        //Here we read in the first word from the user
        String anagram1 = input.nextLine();
        //Here we read in the second word from the user
        System.out.print("Enter the second string: ");
        String anagram2 = input.nextLine();
        isAnagram(anagram1, anagram2);
    }
}
