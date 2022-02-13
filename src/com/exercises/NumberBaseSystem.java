package com.exercises;

import java.util.Stack;

public class NumberBaseSystem {

    public static void main(String[] args) {



        for( int decimal = 1; decimal < 100; decimal++){
            for (int base = 2; base < 10; base++){

                System.out.println(decimal + "'s form in base " + base + " is: " +
                        convertDecimal(decimal, base));
            }

            System.out.println("");
        }
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
