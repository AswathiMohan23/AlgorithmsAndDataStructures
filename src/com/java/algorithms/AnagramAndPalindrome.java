package com.java.algorithms;

public class AnagramAndPalindrome {
    public static void main (String[]args) {
        int lower = 0, upper = 1000;


        for (int i = lower; i <= upper; i++)
            if (isPrime (i)) {
                System.out.println(i);
                reverseInteger(i);
            }

    }

    private static void reverseInteger(int input) {
        int number=input;
        int reverse = 0, reminder = 0;
        while (number != 0) {
            reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number = number / 10;
        }
        System.out.println("Reversed no = " + reverse);
        if(input==reverse){
            System.out.println("\n******************************************************\n");

            System.out.println(reverse+"   ==============> is palindrome\n\n******************************************************\n");
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


