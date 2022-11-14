package com.java.algorithms.balancedParenthesis;

// input ="(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)"


public class BalancedParentheses {
    static Stack stack = new Stack();

    public static void main(String[] args) {
        String expression = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
        balancingEquation(expression);

    }
    public static void balancingEquation(String expression) {

        for (int i = 0; i < expression.length(); i++)
        {
            char input = expression.charAt(i);

            if (input == '(')
            {
                stack.push(i);
            }
            else if (input == ')')
            {
                try
                {
                    long p = (stack.pop() + 1);
                    System.out.println("')' at index "+(i+1)+" matched with '(' at index "+p);
                }
                catch(Exception e)
                {
                    System.out.println("')' at index "+(i+1)+" is unmatched");
                }
            }
        }
        while (stack.isEmpty() )
        {
            System.out.println("'(' at index "+(stack.pop() +1)+" is unmatched");
        }

    }
}