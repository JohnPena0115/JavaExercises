package com.exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintInRange {

    public static void main(String[] args){

        ArrayList<Integer> primeNumbers = new ArrayList<>();

        primeNumbers = primeNumberGenerator(2100);

        for(int start = 0, end = 100; end <= 2100; start += 100, end += 100){

            System.out.println("\nPrime Numbers from " + start + " to " + end);
            printNumbersInRange(primeNumbers, start, end);
        }
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){

        for (int number: numbers){

            if (number >= lowerLimit && number <= upperLimit){

                System.out.println(number);
            }
        }
    }

    public static ArrayList<Integer> primeNumberGenerator (int limit){

        boolean isPrime[] = new boolean[limit + 1];

        for(int index = 2; index < isPrime.length; index++){

            isPrime[index] = true;
        }

        for (int num = 2; num * num <= limit; num++){

            if(isPrime[num]){

                for (int factor = num; factor * num <= limit; factor++){

                    isPrime[factor * num] = false;
                }
            }
        }

        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for(int index = 2; index <= limit; index++){

            if (isPrime[index]){

                primeNumbers.add(index);
            }
        }

        return primeNumbers;
    }
}
