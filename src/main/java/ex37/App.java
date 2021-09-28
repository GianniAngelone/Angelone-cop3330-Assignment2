package ex37;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gianni Angelone
 */
import java.util.*;
import static ex37.passwordGenerator.generatePassword;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What's the minimum length? "); //Asking the user for desired password qualifications
        int size = Integer.parseInt(in.nextLine());
        System.out.print("How many special characters? ");
        int special = Integer.parseInt(in.nextLine());
        System.out.print("How many numbers? ");
        int numbers = Integer.parseInt(in.nextLine());
        System.out.println("Your password is " + generatePassword(size, special, numbers));
    }
}



