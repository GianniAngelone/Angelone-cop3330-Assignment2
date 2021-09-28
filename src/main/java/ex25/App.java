package ex25;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gianni Angelone
 */
import java.util.Scanner;
import static ex25.checkPassword.passwordValidator;
public class App {
    public static void main(String[] args) {
        //Scanner input allows us to read input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.nextLine();
        //Here we read the input from the user

        if (passwordValidator(password) == 1) {
            System.out.print("The password " + password + " is a very weak password.");
        }
        else if (passwordValidator(password) == 2) {
            System.out.print("The password " + password + " is a weak password.");
        }
        else if (passwordValidator(password) == 3) {
            System.out.print("The password " + password + " is a strong password.");
        }
        else if (passwordValidator(password) == 4) {
            System.out.print("The password " + password + " is a very strong password.");
        }
    }
}
