package com.java.algorithms;

import java.util.Scanner;

public class FindYourNumber {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("guess a no between 0 to 50 ");
        int number = sc.nextInt();
        System.out.println("guessed no is " + findTheGuessedNumber());

    }
    static int findTheGuessedNumber() {

        int low = 0, high = 50, mid;
        while (low != high) {
            mid = (low + high) / 2;
            System.out.println("enter 1 if no is between " + low + " - " + mid + "\nEnter 2 if no is between "
                    + (mid + 1) + " - " + high);
            int option = sc.nextInt();
            mid = (low + high) / 2;
            if (option == 1)
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }


}
