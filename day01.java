package com.company;
import java.util.Scanner;

public class day01 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("a : ");
        int a= in.nextInt();
        while(a>=1){
            int i=1;
            if(a>5 || a<2){
                while(i<=3){
                    System.out.print(a);
                    i++;
                }
            }
            else{
                while(i<=2){
                    System.out.print(a);
                    i++;
                }
            }
            a--;
        }
    }
}
