package com.company;

import java.util.Scanner;

public class amstrong {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp = n;
        int f = 1;
        int sum =0;
        for(int i=1; i<=3; i++){
            int rem = n%10;
            for (int j=1; j<=3; j++){
                f *= rem;
            }
            sum += f;
            n /= 10;
            f = 1;
        }
        System.out.println(sum);
        if (temp == sum){
            System.out.println(temp +" is a armstrong number");
        }
        else{
            System.out.println(temp +" is not a armstrong number");
        }

    }
}
