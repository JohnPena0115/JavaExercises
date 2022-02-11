package com.exercises;

import java.util.ArrayList;

public class ArrayListSum {

    public static void main(String[] args) {

        ArrayList<Integer> primeSums = new ArrayList<>();
        ArrayList<Integer> primeSetDifferential = new ArrayList<>();
        int differential = 0;

        for (int limit = 100, index = 0; limit <= 1000; limit += 100, index++) {

            int sum = sum(primeNumberGenerator(limit));
            primeSums.add(sum);
            System.out.println("Sum of all primes up to " + limit + ":");

            if (limit == 100) {
                System.out.println(sum + "\n");
            } else {
                System.out.println(sum);
            }


            if (limit > 100) {

                differential = primeSums.get(index) - primeSums.get(index - 1);
                primeSetDifferential.add(differential);
                System.out.println("Difference between primeset_" + limit +
                        " and primeset_" + (limit - 100) + ":");
            }

            if (limit == 200) {

                System.out.println(differential + "\n");

            } else if (limit > 200) {

                System.out.println(differential);
                System.out.println("Difference of this comparison vs last comparison:");
                System.out.println(primeSetDifferential.get(index - 1) - primeSetDifferential.get(index - 2) + "\n");
            }

        }
    }

    public static int sum(ArrayList<Integer> numbers){

        if (numbers.isEmpty()){

            return -1;
        }

        int sum = 0;

        for(int number: numbers){

            sum += number;
        }

        return sum;
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
