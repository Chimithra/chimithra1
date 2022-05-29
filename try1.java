package com.company;
import java.util.Scanner;

public class try1 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s = a;
            int m = 1;
            for (int j = 1; j <= n; j++) {
                int c = m*b;
                s += c;
                System.out.print(s + " ");
                m *= 2;
            }
        }
        in.close();
    }
}