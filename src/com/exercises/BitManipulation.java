package com.exercises;

public class BitManipulation {

    public static void main(String[] args) {

        int decimalSubstitute = 1;

        while( decimalSubstitute <= 1000) {

            System.out.println("Number of consecutive 1's in binary form of  " +
                    decimalSubstitute + " => " +
                    binaryConsecutiveOnes(decimalSubstitute) );
            decimalSubstitute++;
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
