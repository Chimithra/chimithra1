package com.company;

public class strings {
    public static void main(String args[]){
        String a="chimithra meenu";
        String b="Chimithra meenu";
        System.out.println("hash code : "+a.hashCode());
        System.out.println("hash code : "+b.hashCode());
        System.out.println("equal: "+a.equals(b));
        System.out.println("equals without case sensitive :"+a.equalsIgnoreCase(b));
        System.out.println("length :"+a.length());
        System.out.println("char : "+a.charAt(0));
        System.out.println("string manipulation: "+a.substring(0,9));
        System.out.println("uppercase : "+a.toUpperCase());
        System.out.println("lowercase : "+b.toLowerCase());
        System.out.println("isempty :"+a.isEmpty());
        System.out.println("replace : "+a.replace("meenu","meenamma"));
        System.out.println("contains : "+a.contains("meenamma"));
        System.out.println("starts with : "+a.startsWith("chimi"));
        System.out.println("ends with :"+a.endsWith("nu"));
        char [] c = a.toCharArray();
        for (char carry : c){
            System.out.print(carry +" ");
        }
        System.out.println(" ");
        String d = " chimi ";
        System.out.println("length without trim : "+d.length());
        System.out.println("length after trim: "+d.trim().length());

    }
}
