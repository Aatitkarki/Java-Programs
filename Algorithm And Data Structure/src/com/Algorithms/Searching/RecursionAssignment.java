package com.Algorithms.Searching;

public class RecursionAssignment {
    int addOddNumber(int n) {
        // to be done by student
        if (n == 1) return 1;
        if (n % 2 == 0) {
            return addOddNumber(n-1);
        }
        return n + addOddNumber(n-2);
    }

    public static void main(String[] args) {
        RecursionAssignment ra = new RecursionAssignment();
        System.out.println(ra.addOddNumber(10)); // 1 + 3 + 5 + 7 + 9
        System.out.println(ra.addOddNumber(11)); // 1 + 3 + 5 + 7 + 9 + 11
    }
}
