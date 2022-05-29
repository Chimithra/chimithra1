package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
class arraylist
{
    public static void main(String[] args)
    {
        ArrayList<String>n=new ArrayList<>();
        ArrayList<Integer>n1=new ArrayList<>();
        ArrayList<Integer>n2=new ArrayList<>();
        n.add("chimi");
        n.add("charu");
        n1.add(21);
        n1.add(21);
        n2.add(12345);
        n2.add(54321);
        ArrayList<Object>s1= new ArrayList<>();
        for(int i=0; i<2; i++)
        {
            ArrayList<Object>s= new ArrayList<>();
            s.add(n.get(i));
            s.add(n1.get(i));
            s.add(n2.get(i));
            //System.out.println(s);
            s1.add(s);
        }
        //System.out.println(s1);
        Iterator<Object>s= s1.iterator();
        while(s.hasNext())
        {
            System.out.println(s.next());
        }
    }
}
