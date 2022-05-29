package com.company;

public class stringbuilder {
    public static void main(String args[]){
        StringBuilder a = new StringBuilder("Chimithra is Studying Java @ joes");
        System.out.println(a);
        int upper=0, lower=0, space=0, vowels=0;
        for (int i=0; i<a.length(); i++) {
            if (a.charAt(i) >= 65 && a.charAt(i) <= 90) {
                upper++;
            }
            if (a.charAt(i) >= 97 && a.charAt(i) <= 122) {
                lower++;
                if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
                    vowels++;
                }
            }
            if (a.charAt(i) == 32) {
                space++;
            }
            //if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
               // vowels++;
            //}

        }
        System.out.println("upper: "+upper);
        System.out.println("lower: "+lower);
        System.out.println("space: "+space);
        System.out.println("vowels: "+vowels);
        System.out.println("symbols: "+(a.length()-(upper+lower+space)));

        }
    }

