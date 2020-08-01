package com.Algorithms.Searching;

public class BalanceBracket {

    /*
        return true if the input brackets are balanced, otherwise false
        Example: ()[]{} is balanced but ()[]{] is not balanced
                 [[{()()}]]() is balanced but [[{{})()}]] is not balanced
        Note: brackets are balanced if the opening bracket is followed by its respective
            closing bracket (opening bracket might be followed by another opening bracket too)
     */
    public static boolean isBalanced(String s) {
        //TODO:
        
        return false;
    }

    public static void main(String[] args) {
        String[] input = {"()()[][{{}}]",
                "({{{[()]}}})()",
                "(({{}})([))]))",
                "()[[]]{}{}}()",
                "{{(([[]]))}{}}"};
        for (int i = 0; i < input.length; ++i) {
            System.out.println(isBalanced(input[i]));
        }
    }
}