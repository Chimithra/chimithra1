package com.company;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
class student{
    String Name;
    int Age;
    int Marks;
    public void student1(String Name, int Age, int marks){
        this.Name = Name;
        this.Age = Age;
        this.Marks = marks;
    }
    public void display()
    {
        System.out.print("NAme : "+this.Name+" , ");
        System.out.print("Age : "+this.Age+" , ");
        System.out.print("MArks : "+this.Marks+" , ");
        System.out.println();
    }
}

class collectionsJava{
    public static void main(String [] args){
        //Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        ArrayList<student>list= new ArrayList<student>();
        ArrayList<student>Lists= new ArrayList<student>();
        String [] Name = {"Abi","Baru","Charu","Divya"};
        int [] Age = {15, 14, 14,15};
        int [] marks = {67, 87, 90, 45};
        for(int i=0; i<3; i++) {
            student obj = new student();
            obj.student1(Name[i], Age[i], marks[i]);
            Lists.add(obj);
        }
        //System.out.println();
        //Lists.get(n).display();
        Iterator<student> s1= Lists.iterator();
        while(s1.hasNext())
        {
            System.out.println(s1.next());
        }
    }
}