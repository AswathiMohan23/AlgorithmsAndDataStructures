package com.java.dequeueAbstract;

public class Queue {
    String stackArray[] = new String[9];
    String reverseStackArray[] = new String[9];

    static int enqueueCount = 0;


    public String[] display(String[] array) {
        for (String n : array) {
            if (n != null)
                System.out.println(n + " ");
        }
        return array;
    }

    public String[] enqueue(String data) {
        stackArray[enqueueCount] = data;
        enqueueCount++;

        return stackArray;
    }


    public String[] dequeue(String data) {
        reverseStackArray[--enqueueCount] = data;
        return reverseStackArray;
    }
}




