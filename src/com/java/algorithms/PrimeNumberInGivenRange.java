package com.java.algorithms;

public class PrimeNumberInGivenRange {
    public static void main (String[]args) {
        int lower = 0, upper = 1000;


        for (int i = lower; i <= upper; i++)
            if (isPrime (i))
                System.out.println (i);
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
