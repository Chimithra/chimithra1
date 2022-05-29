package com.company;
import java.util.Scanner;

public class switchWithoutBreak {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        switch(ch){
            case 'a':
                System.out.println(ch + " is a vowel" );
            case 'e':
                System.out.println(ch + " is a vowel" );
            case 'i':
                System.out.println(ch + " is a vowel" );
            case '0':
                System.out.println(ch + " is a vowel" );
            case 'u':
                System.out.println(ch + " is a vowel" );
            default:
                System.out.println(ch + " is not a vowel");

        }
    }
}
