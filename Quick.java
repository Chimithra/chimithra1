package com.company;

import java.util.Arrays;

public class Quick {
    static void quickSort(int [] arr, int low, int high){
        int mid = (low+high)/2;
        int pivot = arr[mid];
        int i = low;
        int j = high;
        while(i<=j){
            while(arr[i]<pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<=j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if(low < j){
            quickSort(arr, low, j);
        }
        if(high > i){
            quickSort(arr,i,high);
        }
    }
    public static void main(String[] args) {
        int [] a = {2, 5, 1, 4, 7, 6, 8, 0};
        System.out.println("Before Quick Sort : "+ Arrays.toString(a));
        quickSort(a, 0, a.length-1);
        System.out.println("After Quick Sort : "+Arrays.toString(a));
    }
}
