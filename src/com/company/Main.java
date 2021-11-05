package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please type an integer- define the size of the table");
        int tableSize = input.nextInt();
        int[] table = new int[tableSize];

        for (int i = 0; i < table.length; i++) {
            System.out.println("Please type the value of #" + i + " element of the table");
            table[i] = input.nextInt();
        }
        System.out.println("The highest value is " + Arrays.stream(table).max().getAsInt());
        System.out.println("The average is " + Arrays.stream(table).average().getAsDouble());
    }
}


