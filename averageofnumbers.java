package com.company;

import java.util.Scanner;

public class averageofnumbers {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int sum = 0;
        for (int i=1; i<=n; i++){
            System.out.println("Enter the values of "+i+":");
            Scanner in1 = new Scanner(System.in);
            int a = in1.nextInt();
            sum += a;
        }
        System.out.println("output of sum is : "+sum);
        System.out.println("output of average is : "+(sum/n));
    }
}
