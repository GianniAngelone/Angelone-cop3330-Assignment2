package ex34;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gianni Angelone
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class employeeRemoval {
    public static void employeeNameRemoval(String name){
        String[] employeesArray = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        List<String> list = new ArrayList<>(Arrays.asList(employeesArray)); //Here, the name the user chose is removed.
        list.remove(name);
        employeesArray = list.toArray(new String[0]);
        //Below we print out our new string, with the name the user chose absent.
        System.out.print("There are 4 employees: \r\n " + Arrays.toString(employeesArray).replace(",", "\n").replace("[", "").replace("]", ""));

    }
}
