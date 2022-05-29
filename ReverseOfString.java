package com.company;

public class ReverseOfString {
    public static void main(String args[]){
        StringBuilder a = new StringBuilder("chimithra is studying");
        System.out.println("original string: "+a);
        StringBuilder b= new StringBuilder();
        for(int i=a.length()-1; i>=0; i--){
            b.append(a.charAt(i));
        }
        System.out.println("Reverse of string: "+b);
    }
}
