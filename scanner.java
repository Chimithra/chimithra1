package com.company;
import java.util.Scanner;

public class scanner {
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        float a,b,c;
        System.out.println("enter 2 num:");
        a=in.nextFloat();
        b =in.nextFloat();
        c=(a*a)+(b*b)-(2*a*b);
        System.out.println("Result:"+c);
    }
}
