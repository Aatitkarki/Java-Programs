package com.Algorithms.Searching;

public class BinarySearch {

    public int binarySearch(int []array,int startIndex,int endIndex,int element){
        if(startIndex>endIndex)return -1;
        int midIndex = (startIndex+endIndex)/2;
        if(array[midIndex]==element) {
            return midIndex;
        }
        else if(array[midIndex]<element){
            return binarySearch(array,midIndex+1,endIndex,element);
        }
        else if(array[midIndex]>element){
            return binarySearch(array,startIndex,midIndex-1,element);
        }
        return -1;


    }

    public static void main(String[] args) {
        int array[] = {1,3,4,6,7,9,10,13,15,19,22,26,29,34,39,41,46,48,62,68,70,81,82,85,89};
        BinarySearch bs = new BinarySearch();
        int index = bs.binarySearch(array,0,array.length-1,2222);
        System.out.println(index);
    }
}
