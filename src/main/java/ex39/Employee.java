package ex39;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gianni Angelone
 */
public class Employee {
    private final String firstName;
    private final String lastName;
    private final String department;
    private final double separationDate;
    //Organzing the information
    public Employee(String firstName, String lastName, String department,double separationDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.separationDate=separationDate;
    }
    public String FirstName()
    {
        return firstName;
    }
    public String LastName()
    {
        return lastName;
    }
    public String Department()
    {
        return department;
    }
    public double SeparationDate()
    {
        return separationDate;
    }
    //Return string
    public String toString()
    {
        return String.format("%-8s %-10s %-21s %-8.0f", //Format for printing in an organized manner
                FirstName(), LastName(), Department(), SeparationDate());
    }
}

