/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Troy Baggs
 */

package org.example;
import java.util.Scanner;

class Number
{
    int n;
}

public class Exercise21
{
    public static void main( String[] args )
    {
        Number n = new Number();
        n = inputs(n);
        String month = "";
        switch(n.n)
        {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                throw new IllegalArgumentException("Invalid month: " + n.n);
        }

        System.out.println("The name of the month is " + month + ".");
    }

    public static Number inputs(Number n)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the month: ");
        n.n = sc.nextInt();
        return n;
    }
}
