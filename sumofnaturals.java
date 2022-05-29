package com.company;
import java.util.Scanner;

public class sumofnaturals {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int temp =0;
        while (n!=0){
            int rem = n%10;
            temp += rem;
            n /= 10;
            System.out.println(temp);
        }
    }
}
