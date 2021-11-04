package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner size = new Scanner(System.in);
        Scanner value = new Scanner(System.in);
        int highestValue = 0;
        int sum = 0;
        System.out.println("Please type an integer- define the size of the table");
        int tableSize = size.nextInt();
        int[] table = new int[tableSize];

        for (int i = 0; i < tableSize; i++) {
            System.out.println("Please type the value of #" + i + " index of the table");
            table[i] = value.nextInt();
            sum += table[i];
            if (table[i] > highestValue) {
                highestValue = table[i];
            }
        }
        double average = (((double) sum / tableSize) * 100) / 100;

        System.out.println("The highest value is " + highestValue);
        System.out.println("The average is " + average);
    }


}


