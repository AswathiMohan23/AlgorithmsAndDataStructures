package com.java.algorithms;

import java.util.Arrays;

public class AnagramAndPalindrome {
    static int[] inputArray = new int[1000];
    static int count,countNotPrime,num;



    public static void main(String[] args) {

        int lower = 0, upper = 1000,j=0;
        for (int i = lower; i <= upper; i++) {
                if (isPrime(i)) {
                    count++;
                    System.out.println(i);
                    reverseInteger(i);
                }
                else{
                        inputArray[j++]=i;
                        anagramCheck(String.valueOf(j));
        }
        }
        countNotPrime=1000-count;
        for(int k=2;k<countNotPrime;k++){
            System.out.println("non-prime : "+inputArray[k]);
            anagramCheck(String.valueOf(k));}

    }

    private static void anagramCheck(String i) {
            //char[] first = i.toCharArray();
        char[] second = sorting(i.toCharArray());

            for(int k=0;k<countNotPrime;k++){
                if(second.equals(i.toCharArray()))
                    System.out.println(i+"its an Anagram");
                }


        }

    private static char[] sorting(char[] array) {
        char temp;
        int i = 0;
        while (i < array.length) {
            int j = i + 1;
            while (j < array.length) {
                if (array[j] < array[i]) {

                    // Comparing the characters one by one
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                j++;
            }
            i++;

        }
        //System.out.println(array);
        return array;

}



    private static void reverseInteger(int input) {
        int number=input;
        int reverse = 0, reminder = 0;
        if(input>10) {
            while (number != 0) {
                reminder = number % 10;
                reverse = reverse * 10 + reminder;
                number = number / 10;
            }
            //System.out.println("Reversed no = " + reverse);
            if (input == reverse) {
                System.out.println("\n******************************************************\n");

                System.out.println(reverse + "   ==============> is palindrome and anagram\n\n****************************************\n");
            }
        }
    }


    static boolean isPrime (int number)
    {
        // 0, 1 neither prime nor composite
        if (number < 2)
            return false;

        // checking the number of divisors b/w 1 and the number n-1
        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}


