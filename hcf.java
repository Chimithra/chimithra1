package com.company;

import java.util.Scanner;
class hcf1{
    public int hcf(int a, int b){
        int temp;
        while(b>0){
            temp = b;
            b = a%b;
            System.out.println("b : "+b);

            a = temp;
        }
        return a;
    }
}

public class hcf {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        hcf1 s = new hcf1();
        System.out.println(" HCF : "+s.hcf(5,10));
        System.out.println(" HCF : "+s.hcf(22,56));
    }
}
