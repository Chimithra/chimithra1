package com.company;

public class stringbufferANDbuilder {
    public static void main(String args[]){
        StringBuffer buffer = new StringBuffer("chimithra"); // stringbuilder is also same function of stringbuffer
        System.out.println(buffer); // if i change the type as stringbuilder => result will be the same
        buffer.append(" meenu");
        System.out.println(buffer);
        buffer.insert(15," " + " studying");
        System.out.println(buffer);
        buffer.replace(10,15,"@@@");
        System.out.println(buffer);
        buffer.delete(10,15);
        System.out.println(buffer);
        buffer.reverse();
        System.out.println(buffer);
        System.out.println(buffer.charAt(2));
        System.out.println(buffer.length());
        System.out.println(buffer.substring(0,8));
        buffer.setCharAt(1,'@');
        System.out.println(buffer);
        StringBuffer s= new StringBuffer();
        System.out.println(s.capacity());
        s.append("do you know me? who am i");
        System.out.println(s);
        System.out.println(s.capacity());
    }
}
