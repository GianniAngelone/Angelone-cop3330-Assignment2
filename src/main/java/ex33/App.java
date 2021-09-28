package ex33;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gianni Angelone
 */
import java.util.Scanner;

import static ex33.responseCheck.runResponse;
public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What's your question?\r\n> ");
        String response = input.nextLine();
        runResponse(response);
    }
}


