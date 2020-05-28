package com.Algorithms.Sorting;

public class Demo {

    public static String toString(int [] array){
        String data = "[ ";
        for(int i = 0;i<array.length;i++){
            data += array[i] + ",";
        }
        data +=" ]";
        return data;
    }
    public static void main(String []args){
        BubbleSort bs = new BubbleSort();
        int [] data  = {1,2,5,4,3,6,7,8,9};
        int [] sortedArray = bs.sortedArray(data);
        System.out.println(toString(sortedArray));

    }
}
