package com.company;

public class capitalizeString {
    public static void main(String args[]){
        StringBuilder a = new StringBuilder("cHImiTHra Is sTUdyINg");
        System.out.println("before capitalize : "+a);
        if(a.charAt(0)>=97 && a.charAt(0)<=122){
            int c = a.charAt(0)-32;
            a.setCharAt(0,(char)c);
        }
        for(int i=1; i<a.length();i++){
            if(a.charAt(i)==32){
                i++;
                if(a.charAt(i)>=97 && a.charAt(i)<=122) {
                    int c = (int) a.charAt(i) - 32;
                    a.setCharAt(i, (char) c);
                }
            }
            else{
                if(a.charAt(i)>=65 && a.charAt(i)<=90) {
                    int c = (int) a.charAt(i) + 32;
                    a.setCharAt(i, (char) c);
                }
            }
        }
        System.out.println("after capitalize : "+a);
    }
}
