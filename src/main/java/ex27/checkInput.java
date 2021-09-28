package ex27;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gianni Angelone
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class checkInput {
    public static void validateFirstName(String firstName) {
        Pattern validFirstName = Pattern.compile("^.{2,}$");
        //The first name must be at least 2 characters long, so this will notify the user
        Matcher m1 = validFirstName.matcher(firstName);
        if (!m1.matches()) {
            System.out.print("The first name must be at least 2 characters long.\r\n");}
    }
    public static void validateLastName(String lastName) {
        int lastNameLength = lastName.length();
        //Checking to see last name has correct format (Not less than 2 or blank).
        if (lastNameLength == 0) {
            System.out.print("The last name must be at least 2 characters long.\r\n");
            System.out.print("The last name must be filled in.\r\n"); //Can not be left blank
        } else {
            Pattern validLastName = Pattern.compile("^.{2,}$"); //Notifies user that it is too short
            Matcher m2 = validLastName.matcher(lastName);
            if (!m2.matches()) {
                System.out.print("The last name must be at least 2 characters long.\r\n");}
        }
    }
    public static void validateZipCode(String zipCode) {
        Pattern validZipCode = Pattern.compile("\\d{5}"); //Number must have correct qualifications - 5-digit number
        Matcher m3 = validZipCode.matcher(zipCode);
        if (!m3.matches()) {
            System.out.print("The zipcode must be a 5 digit number.\r\n");}
    }
    public static void validateEmployeeID(String employeeID) {
        Pattern validEmployeeID = Pattern.compile("^.*[A-Z]{2}(-\\d{4})?$"); //Must have correct qualifications - AB-1234 format
        Matcher m4 = validEmployeeID.matcher(employeeID);
        if (!m4.matches()) {
            System.out.print("The employee ID must be in the format of AA-1234.");}
    }
}
