package com.company;

import java.util.Scanner;

public class leapyear {
    public static void main(String [] args)
    {
        int year;
        System.out.println("enter the year:");
        Scanner in = new Scanner(System.in);
        year =in.nextInt();
        if(year%4==0){
            System.out.println("this is leap year:"+year);

        }
        else{
            System.out.println("this is not a leap year:"+year);
        }
    }

}
