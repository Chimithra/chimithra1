package com.company.Pract;

import java.util.Arrays;

class Array{
    void CopyArray(int [] arr){
        int [] copy = new int [5];
        int ar1 [] = {2, 6, 5, 9, 4, 8, 7};
        copy = java.util.Arrays.copyOf(arr,2);
//        System.arraycopy(arr,2,copy,0,5);
        System.out.println("Binary Search  : "+Arrays.binarySearch(arr,7));
        System.out.println("is equal : "+Arrays.equals(ar1,arr));
        System.out.println("Copied Array : "+ java.util.Arrays.toString(copy));
        /** parallel sort is faster than the sequential sort
         * especially for multiprocessor system
         * after java 8 = parallel sort & dual pivot quick sort
         * it cannot be print by sysout in straight and cannot be chaining
         *
        */
        Arrays.parallelSort(arr);
        System.out.println("Parallel Sort : "+Arrays.toString(arr));
        /**
         * map is to conversion format of string to someother (mapper extends string class)
         * but it not support for int  because coffee is int
         * mapToObj will help for convertion
         */
        java.util.Arrays.stream(copy).mapToObj(coffee -> coffee + " ").forEach(System.out::print);
    }
}
public class ArrayPract {
    int m;
    public static void main(String[] args) {
        Array a = new Array();
        int ar [] = {2, 6, 5, 9, 4, 8, 7};
        a.CopyArray(ar);
        String s;
        System.out.println("\n" + new ArrayPract().m);

    }
}
