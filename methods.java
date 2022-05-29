package com.company;
import java.util.Scanner;
class method1{
    public void add(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers of A & B: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a+b;
        System.out.println("Addition : "+c);
    }
    public void sub(int a, int b){
        int c = a-b;
        System.out.println("subtraction: "+c);
    }
    public int mult(){
        System.out.println("Enter the numbers for mult : ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        return a*b;
    }
    public float div(int x,int y){
        return x/y;
    }
}
public class methods {
    public static void main(String args[]){
        method1 x = new method1();
        x.add();
        x.sub(35,10);
        System.out.println("Multiplication : "+x.mult());
        System.out.println("Division : "+x.div(10,5));
    }
}
