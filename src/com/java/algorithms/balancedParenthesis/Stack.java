package com.java.algorithms.balancedParenthesis;

public class Stack {

    private int maxSize;
    private long[] stackArray=new long[50];
    private int top;

    public void push(long j)
    {
        stackArray[++top] = j;
    }

    //for pop
    public long pop()
    {
        return stackArray[top--];
    }

    //for peek
    public long peek()
    {
        return stackArray[top];
    }

    //to check whether stack is empty
    public boolean isEmpty()
    {
        return (top == -1);
    }

    //to check whether stack is full
    public boolean isFull()
    {
        return (top == maxSize - 1);
    }
}

