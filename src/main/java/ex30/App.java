package ex30;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gianni Angelone
 */
public class App {
    public static void main(String[] args){
        for(int i=1; i<=12; i++) //These are the columns, 1-12
        {
            for(int j=1; j<=12; j++) //These are the rows, 1-12
            {
                System.out.print((i * j) + "\t"); //We multiply rows by columns to display a multiplication table
            }
            System.out.println();
        }
    }
}
