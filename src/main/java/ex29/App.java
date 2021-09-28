package ex29;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gianni Angelone
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class App {
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in);
        System.out.print("What is the rate of return? ");
        String Rate = input1.nextLine();
        Pattern validRate1 = Pattern.compile("^[1-9]*$");
        Matcher m1 = validRate1.matcher(Rate);
        if (m1.matches()) {
            int rate = Integer.parseInt(Rate); //Here we have to convert our string type to an integer type.
            int years1 = 72/rate; //The given equation
            System.out.print("It will take " + years1 + " years to double your initial investment.");
        } else {
            while(!m1.matches()){
                Scanner input2 = new Scanner(System.in);
                System.out.print("Sorry. That's not a valid input.\n" + "What is the rate of return? ");
                String rate2 = input2.nextLine(); //Repeats if user does not enter a valid input
                Pattern validRate2 = Pattern.compile("^[1-9]*$");
                Matcher m2 = validRate2.matcher(rate2);
                if(m2.matches()){
                    //Here we have to convert our string type to an integer type.
                    int correctRate = Integer.parseInt(rate2);
                    int years2 = 72/correctRate;
                    System.out.print("It will take " + years2 + " years to double your initial investment.");
                    System.exit(1);
                }
            }
        }
    }
}
