package ex35;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gianni Angelone
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        String[] namesArray = {}; //Here to declare an empty array for the user to insert names into
        do {
            System.out.print("Enter a name: ");
            name = input.nextLine();
            ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(namesArray));
            if (!name.isBlank()){ //This will check for any blank names
                arrayList.add(name);
            }
            namesArray = arrayList.toArray(namesArray);
        }
        while (!name.isEmpty()); //Here we continue taking input until the user inputs blank, meaning continue.
        if (name.isBlank()) {
            int index = new Random().nextInt(namesArray.length);
            String random = (namesArray[index]); //Choosing a random winner
            System.out.print("The winner is... " + random); //Here we print the winner.
            System.exit(1);
        }
    }
}



