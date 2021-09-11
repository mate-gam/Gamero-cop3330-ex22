/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Mateo Gamero
 */
import java.util.Scanner;
public class App
{
    public static void main (String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("What is the first number: ");
        int first = sc.nextInt();
        System.out.print("What is the second number: ");
        int second = sc.nextInt();
        System.out.print("What is the third number: ");
        int third = sc.nextInt();


        int max;
        if (first > second && first > third)
        {
            max = first;
        }
        else if (second > first && second > third)
        {
            max = second;
        }
        else
        {
            max = third;
        }
        System.out.println("The largest number is " + max + ".");
    }
}
