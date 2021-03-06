package com.epam.collections.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackReverse {
    private static final Stack<Integer> digits = new Stack<>();
    private static final List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        setDefaultValuesForStack();
        System.out.println("Before Reverse: "+ digits);
        reverse();
        System.out.println("After Reverse: "+list);
    }

    private static void setDefaultValuesForStack() {
        digits.push(10);
        digits.push(15);
        digits.push(3);
        digits.push(44);
    }

    private static void reverse() {
        while(digits.size() > 0){
            list.add(digits.pop());
        }
    }
}
