package com.xxx.proj;

import java.util.Arrays;

public class CodeSelectionSort {
    public static void selectionSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr,i,minIndex);
        }
    }

    public static void swap(int[] arr,int i,int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void main(String[] args) {
        int[] arr = {2,8,9,3,1,6,5,7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
