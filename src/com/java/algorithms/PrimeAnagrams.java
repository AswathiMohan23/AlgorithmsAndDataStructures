package com.java.algorithms;

import java.util.Arrays;

public class PrimeAnagrams {
    public static void main(String[] args){
        for (int i = 0; i <= 1000; i++) {
            if (isPrime(i)) {
                for (int j = i; j < 1000; j++) {
                    if (i != j) {
                        if (isPrime(j)) {
                            if (isAnagram(String.valueOf(i), String.valueOf(j)))
                                System.out.println(i + " " + j + " is prime and anagram");
                        }
                    }
                }
            }
        }
    }
    public static boolean isAnagram(String firstString, String secondString) {
        char[] firstArray = firstString.toCharArray();
        char[] secondArray = secondString.toCharArray();
        if (firstString.length() != secondString.length()) {
            return false;
        } else {
            Arrays.sort(firstArray);
            Arrays.sort(secondArray);
            if (Arrays.equals(firstArray, secondArray)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }

}
