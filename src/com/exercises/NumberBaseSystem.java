package com.exercises;

import java.util.Stack;

public class NumberBaseSystem {

    public static void main(String[] args) {

        decimalBaseForms(1,100);

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

    public static void decimalBaseForms(int startValue, int iterations){

        for (int currentValue = startValue; currentValue <= iterations; currentValue++){
            for(int base = 2; base <= 10; base++){

                System.out.println(currentValue + "'s form in base " + base + " is: " +
                        convertDecimal(currentValue, base));
            }
            System.out.println("");
        }


    }
}
