package com.java.dequeueAbstract;

import java.util.Scanner;

public class PalindromeChecker {
    static Scanner sc =new Scanner(System.in);
    static Queue queue=new Queue();

    public static void main(String[] args){
        System.out.println("Enter the string : ");
        String word = sc.next();
        int size=word.length();
        char[] convertedWord=new char[size];
        String[] firstString=new String[size];
        String[] secondString=new String[size];


        for(int i=0;i<size;i++) {
            convertedWord[i] = word.charAt(i);
            firstString=queue.enqueue(String.valueOf(convertedWord[i]));
        }
        queue.display(firstString);
        for(int i=0;i<size;i++) {
            secondString = queue.dequeue(firstString[i]);
        }
        System.out.println("the reverse string is \n");
        queue.display(secondString);
        if((firstString).equals(secondString)){
            System.out.println("its palindrome");}
        else
            System.out.println("not palindrome");
    }

    }


