package com.java.bankCashCounter;

import java.util.LinkedList;
import java.util.Scanner;

public class BankCashCounterMain {
    static BankQueue bankQueue=new BankQueue();
    static Scanner sc =new Scanner(System.in);
    static long balance=0;

    public static void main(String[] args){
    enqueue();
    dequeueList();


    }
    public static void enqueue() {
        System.out.println("\n=======================\n\nQueue for withdrawing/ depositing ===================== ");
        bankQueue.enqueue(1);
        bankQueue.enqueue(2);
        bankQueue.enqueue(3);
        bankQueue.enqueue(4);
        bankQueue.enqueue(5);
        bankQueue.enqueue(6);
        bankQueue.display();
    }
    public static void dequeueList(){// deque removes elements from start
        System.out.println("======================= remaining queue =======================");
        bankQueue.dequeue(1);
        deposit();
        bankQueue.dequeue(2);
        withDraw();
        bankQueue.dequeue(3);
        deposit();
        System.out.println("======================================== the remaining queue ==================================");
        bankQueue.display();

    }
    public static void deposit(){
        System.out.println("enter the amount to be deposited : ");
        balance=balance+sc.nextLong();
        System.out.println("balance = "+balance);
    }
    public static void withDraw(){
        System.out.println("enter the amount to be withdrawn : ");
        long money=sc.nextLong();
        balance=balance-money;
        System.out.println("balance = ");
        if(balance<money)
            System.out.println("no sufficient balance");
        else {
            balance = balance - money;
            System.out.println("balance = " + balance);
        }

    }


    }
