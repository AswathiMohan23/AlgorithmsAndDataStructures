package com.java.bankCashCounter;

import java.util.LinkedList;

public class BankQueue {
    int stackArray[] = new int[6];
    int pushCount = 0;
    int enqueueCount=0;


    public void display() {
        for (int n : stackArray) {
            System.out.println(n + " ");
        }
    }

    public void enqueue(int data) {
        stackArray[enqueueCount] = data;
        enqueueCount++;

    }
    public void dequeue(int data) {
            stackArray[--data]=0;

        }
    }




