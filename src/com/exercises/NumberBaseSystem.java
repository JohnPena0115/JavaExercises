package com.exercises;

import java.util.Stack;

public class NumberBaseSystem {

    public static void main(String[] args) {

//        System.out.println(convertDecimal(5, 3));
//        System.out.println(convertDecimal(3, 3));


    }

    public static String convertDecimal(int decimal, int base){

        Stack<Integer> stack = new Stack<>();

        int baseDigit;
        StringBuilder baseString = new StringBuilder();


        while (decimal != 0) {

            baseDigit = decimal % base;
            stack.push(baseDigit);
            decimal /= base;
        }

        while(!stack.isEmpty()){

            baseString.append(stack.pop());

        }

        return baseString.toString();

    }
}
