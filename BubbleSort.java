package com.company;
import java.util.Arrays;

public class BubbleSort {
    public static void bubblesort(int [] arr){
        int temp;
        for(int i=1; i<arr.length; i++){
            boolean swapped = false;
            for(int j=0; j<arr.length-i; j++){
                if(arr[j+1]<arr[j]){
                    swapped = true;
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String [] args){
        int [] arr = {3,5,8,9,5,7,9};
        BubbleSort.bubblesort(arr);
        System.out.print("After sorting : "+Arrays.toString(arr));
    }
}
