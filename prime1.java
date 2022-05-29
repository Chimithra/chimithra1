package com.company;

import java.util.Scanner;

public class prime1 {
    public static void main (String args[]){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the limit :");
        int n = in.nextInt();
        int f=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    f++;
                }
            }
            if (f==2){
                System.out.println(i +" is a prime number");
            }f=0;
        }

    }
}
