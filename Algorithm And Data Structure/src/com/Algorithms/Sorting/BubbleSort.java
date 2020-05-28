package com.Algorithms.Sorting;

public class BubbleSort {
    public int[]sortedArray(int[]array){
        int n = array.length;
        for(int i = 0; i<n;i++){
            boolean sorted = true;
            for(int j = 1;j<n-i;j++){
                if(array[j-1]>array[j]) {
                    int temp = array[j-1];
                    array[j-1]= array[j];
                    array[j]=temp;
                    sorted = false;
                }
            }
            if(sorted == true){
                break;
            }
        }
        return array;
    }
}
