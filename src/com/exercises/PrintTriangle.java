package com.exercises;

public class PrintTriangle {

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);

        System.out.println("------------------------------");

        printTriangle(10);

    }

    public static void printStars(int number) {

        for (int i = 0; i < number; i++){

            System.out.print("*");
        }

        System.out.println("");
    }

    public static void printSpaces(int number) {

        for (int i = 0; i < number; i++){

            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {

        int spaces = size -1;
        int stars = 1;

        while (size >= 1) {

            if (spaces != 0) {

                printSpaces(spaces);
            }

            printStars(stars);

            size--;
            spaces--;
            stars++;

        }
    }

}
