package ex26;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gianni Angelone
 */
public class PaymentCalculator {
    public static double UntilPaidOff(double b, double apr, double p){
        double i = apr/365;
        double n;
        double x = 1+i;
        double y = 30;
        n = (-(1/30) * (Math.log(1 + (b/p) * (-1) * (1 - Math.pow(x, y))))/Math.log(x));
        //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        return (n);
    }
}
