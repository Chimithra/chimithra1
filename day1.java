package com.company;
import java.util.Scanner;

public class day1 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of a: ");
        int a = in.nextInt();
        for (int i=a; i>=1; i--){
            if(i>5 || i<2){
                for(int j=1; j<=3; j++) {
                    System.out.print(i);
                }
            }
            else{
                for(int j=1; j<=2; j++){
                    System.out.print(i);
                }
            }
        }
    }
}
