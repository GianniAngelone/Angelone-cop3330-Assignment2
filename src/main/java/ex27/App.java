package ex27;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gianni Angelone
 */
import java.util.Scanner;
import static ex27.checkInput.*;
public class App {
    public static void validateInput(String firstName, String lastName, String zipCode, String employeeID){
        validateFirstName(firstName);
        validateLastName(lastName);
        validateZipCode(zipCode);
        validateEmployeeID(employeeID);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Getting information from the user
        System.out.print("Enter the first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter the last name: ");
        String lastName = input.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zipCode = input.nextLine();
        System.out.print("Enter the employee ID: ");
        String employeeID = input.nextLine();
        //calling the function for a return value
        validateInput(firstName, lastName, zipCode, employeeID);
    }
}
