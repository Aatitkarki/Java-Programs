package com.Algorithms.Searching;

import javax.sound.sampled.Line;

public class LinearSearch {
    public int linearSearch(int []data,int searchedData){
        for(int i = 0;i<data.length;i++){
            if(searchedData == data[i]){
                System.out.println("Data is found at index "+i);
                return 1;
            }
        }
        System.out.println("There is no any data of "+searchedData );
        return 0;

    }

    public static void main(String[] args) {
        int data []= {44,45,98,698,7,6,8,0,687,6,1,646,6,47,647,6,4,46,4,64,6,79,7,2};
        LinearSearch ls =new LinearSearch();
        ls.linearSearch(data,999);

    }
}
