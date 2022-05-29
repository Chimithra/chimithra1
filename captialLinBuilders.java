package com.company;

public class captialLinBuilders {
    public static void main(String args[]){
        StringBuilder a = new StringBuilder("Chimithra");
        System.out.println("original string : "+a);
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)>=97 && a.charAt(i)<=122){
                int c = (int)a.charAt(i)-32;
                a.setCharAt(i,(char)c);
            }
        }
        System.out.println("uppercase output: "+a);
    }
}
