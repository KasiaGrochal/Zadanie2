package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int highestValue = 0;
        int sum = 0;
        System.out.println("Please type an integer- define the size of the table");
        int tableSize = input.nextInt();
        int[] table = new int[tableSize];

        for (int i = 0; i < table.length; i++) {
            System.out.println("Please type the value of #" + i + " element of the table");
            table[i] = input.nextInt();
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


