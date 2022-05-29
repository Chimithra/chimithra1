package com.company;

public class PatternArrayProgram {
    public static void main(String [] args){
        String  string = "program";
        if(string.length()%2 == 1) {
            for (int i = 1; i <= string.length(); i++) {
                for (int j = 1; j <= string.length(); j++) {
                    if (i == j) {
                        System.out.print(string.charAt(i - 1));
                    } else if (i + j == string.length() + 1) {
                        System.out.print(string.charAt(string.length() - i));
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
        else{
            System.out.println(0);
        }


    }
}
