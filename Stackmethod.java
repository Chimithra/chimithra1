package com.company;
import java.util.Stack;
import java.util.Iterator;
public class Stackmethod {// LIFO,constant time[0(1)]
    public static void main(String [] args){
        Stack<Integer>s1 = new Stack<>();
        s1.push(1);
        s1.push(5);
        s1.push(2);
        s1.push(3);
        s1.push(8);
        s1.push(6);
        System.out.println(s1);
        System.out.println(s1.pop());// remove last elem only
        System.out.println(s1.peek());// give last elem only
        System.out.println(s1.isEmpty());// return boolean
        System.out.println(s1.search(4));// if present get lenth of index otherwise return -1;
        for(int a : s1){
            System.out.print(a);
        }
        System.out.println();
        Iterator a1 = s1.iterator();
        while(a1.hasNext()){
            Object s2 = a1.next();
            System.out.print(s2+",");
        }
        System.out.println();
        System.out.println(s1.size());
        s1.sort(null);
        System.out.println(s1);
    }
}
