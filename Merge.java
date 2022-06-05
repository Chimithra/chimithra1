package com.company;

import java.util.Arrays;

public class Merge {
    static int [] merge(int [] first, int [] second){
        int [] mergeArr = new int[first.length + second.length];
        int i=0, j=0, k=0;
        while(i<first.length && j<second.length){
            if(first[i] < second[j]){
                mergeArr[k] = first[i];
                i++;
            }
            else{
                mergeArr[k] = second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            mergeArr[k] = first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mergeArr[k] = second[j];
            j++;
            k++;
        }
        return mergeArr;
    }
    static int [] mergeSort(int [] arr){
        int length = arr.length;
        int mid = length/2;
        if(length < 2){
            return arr;
        }
        int [] left = new int [mid];
        int [] right  = new int [length - mid];
        for(int i=0; i<mid; i++){
            left[i] = arr[i];
        }
        for(int j=mid; j<length; j++){
            right[j-mid] = arr[j];
        }
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);

    }
    public static void main(String[] args) {

        int [] a = {4, 7, 9, 5, 2, 3, 0};
        System.out.println("Before Merge Sort : "+ Arrays.toString(a));
        int [] b = mergeSort(a);
        System.out.println("After Merge Sort : "+ Arrays.toString(b));

    }
}
