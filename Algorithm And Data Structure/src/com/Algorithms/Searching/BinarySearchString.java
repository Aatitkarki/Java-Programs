package com.Algorithms.Searching;

public class BinarySearchString {

    int binarySearch(String[] names, int startIndex, int endIndex, String name) {

        if (startIndex > endIndex) return -1;
        int mid = (startIndex + endIndex) / 2;
        if (names[mid].equals(name)) return mid;
        else if (names[mid].compareTo(name) < 0)
            return binarySearch(names, mid + 1, endIndex, name);
        else if (names[mid].compareTo(name) > 0)
            return binarySearch(names, startIndex, mid - 1, name);
        return -1;
    }

    public static void main(String[] args) {
        String[] names = {"apple", "appzz", "ball", "cat", "dog", "elephant", "fox", "giraffe",
                "joker", "kite", "lemon", "lion", "man", "mouse", "net", "nike", "orange",
                "poke", "zebra"};
        BinarySearchString binarySearch = new BinarySearchString();
//        for (int i = 0; i < names.length; ++i) {
//            int index = binarySearch.binarySearch(names, 0, names.length, names[i]);
//            System.out.println("Index of " + names[i] + " is " + index);
//        }
        int index = binarySearch.binarySearch(names, 0, names.length, "nike");
        if (index == -1) {
            System.out.println("Element not found!");
        }else{
            System.out.println("The element is in "+index+" index");
        }
    }
}
