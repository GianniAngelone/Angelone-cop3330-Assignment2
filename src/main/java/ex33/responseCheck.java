package ex33;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gianni Angelone
 */
import java.util.Random;
public class responseCheck {
    public static void runResponse (String response){
        String[] optionsArray = {"Yes.", "No.", "Maybe.", "Ask again later."};
        //Mimics an 8-ball, with the responses it would give you
        if (response.isBlank()) {
            System.out.print("Please enter a response.");
        }
        else {
            int index = new Random().nextInt(optionsArray.length); //Chooses a random answer
            String random = (optionsArray[index]);
            System.out.print(random);
        }
    }
}
