package com.company;

import java.util.Scanner;

public class fibonacci {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int a=0,b=1,c;
        for (int i=1; i<=n; i++){
            c = a+b;
            a = b;
            b = c;
            System.out.print(" "+c);
        }
    }
}
