package ex31;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gianni Angelone
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class App {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in); //Here we get input from the user, resting pulse and age.
        System.out.print("Resting Pulse: ");
        String pulse = input1.nextLine(); //Here we get resting pulse
        Pattern validPulse = Pattern.compile("^[1-9]*$");
        Matcher validPulseInput = validPulse.matcher(pulse);
        System.out.print("Age: ");
        String age = input1.nextLine(); //Here we get age
        Pattern validAge = Pattern.compile("^[1-9]*$");
        Matcher validAgeInput = validAge.matcher(age);
        if (validPulseInput.matches() && validAgeInput.matches()) {
            System.out.print("Intensity         | Rate      \r\n");
            System.out.print("------------------|-----------\r\n");
            int increment = 5; //percentage increment
            float intensity = 50;
            while (intensity < 95) {
                intensity = intensity + increment;
                float ageInput = Integer.parseInt(age); //Here we have to convert our string type to an integer type.
                float pulseInput = Integer.parseInt(pulse);
                float TargetHeartRate = (((220 - ageInput) - pulseInput) * (intensity / 100)) + pulseInput;
                System.out.print(intensity + "%             | " + Math.round(TargetHeartRate) + " bpm\r\n");}
        } else { //If user does not enter valid inputs
            System.out.print("One or more inputs are invalid. Please enter valid inputs.");
            System.exit(1);
            }
    }
}
