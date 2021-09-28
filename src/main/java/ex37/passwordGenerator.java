package ex37;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gianni Angelone
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class passwordGenerator {
    public static String generatePassword(int length, int special, int nums)
    {
        //Takes library of set characters to randomize.
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$%^&*";
        String numbers = "1234567890";
        Random random = new Random();
        ArrayList<Character> chars = new ArrayList<>();
        //Looking for specific amount of special characters.
        for(int i=0; i<special; i++){
            chars.add(specialCharacters.charAt(random.nextInt(specialCharacters.length())));}
        //Loops until the user has a desired length.
        for(int i=0; i<nums; i++){
            // find random numeral and add it to the list
            chars.add(numbers.charAt(random.nextInt(numbers.length())));}
        //Finishing the password
        for(int i=chars.size()-1; i<length; i++){
            // find random letter and add it to the list
            chars.add(letters.charAt(random.nextInt(letters.length())));}
        //This will shuffle the password
        Collections.shuffle(chars);
        //Empty string filled with new password
        StringBuilder password = new StringBuilder();
        //Combines the password into one
        for(Character s : chars)
        {
            password.append(s);
        }
        //Return
        return password.toString();
    }
}
