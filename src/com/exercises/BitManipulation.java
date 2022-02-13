package com.exercises;

public class BitManipulation {

    public static void main(String[] args) {

        int decimal = 1;

        while( decimal <= 100) {

            System.out.println("Number of consecutive 1's in binary form of  " +
                    decimal + " => " + binaryConsecutiveOnes(decimal) );

            System.out.println("Binary from of " + decimal + " => " +
                    Integer.toBinaryString(decimal) + "\n");

            decimal++;
        }
    }

    public static int binaryConsecutiveOnes(int number) {

        int consecutiveOnes = 0;
        while (number > 0) {

            number = number & (number << 1);
            consecutiveOnes++;
        }

        return consecutiveOnes;
    }
}
