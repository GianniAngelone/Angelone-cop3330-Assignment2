package ex25;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gianni Angelone
 */

import java.util.regex.*;

public class checkPassword {

    public static int passwordValidator(String password) {

        int strengthValue = 0;
        //The strengthValue will allow us to determine the password strength
        //Checks if the password is 'very weak'
        Pattern p1 = Pattern.compile("^(?=.*[0-9]).{1,7}$");
        Matcher m1 = p1.matcher(password);
        //Checks if the password is 'weak'
        Pattern p2 = Pattern.compile("^(?=.*[a-zA-Z]).{1,7}$");
        Matcher m2 = p2.matcher(password);
        //Checks if the password is 'strong'
        Pattern p3 = Pattern.compile("^(?=.*[0-9])(?=.*[a-zA-Z])(?!.*[@#$%^&-+=()]).{8,}$");
        Matcher m3 = p3.matcher(password);
        //Checks if the password is 'very strong'
        Pattern p4 = Pattern.compile("^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[@#$%^&-+=()]).{8,}$");
        Matcher m4 = p4.matcher(password);
        //Password gets stronger as the count increases
        if (m1.matches())
        {
            int count = 1;
            strengthValue += count;
        }
        else if (m2.matches())
        {
            int count = 2;
            strengthValue += count;
        }
        else if (m3.matches())
        {
            int count = 3;
            strengthValue += count;
        }
        else if (m4.matches())
        {
           int count = 4;
           strengthValue += count;
        }

        return (strengthValue);
    }
}

