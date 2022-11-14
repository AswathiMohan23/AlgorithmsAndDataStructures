package com.java.dequeueAbstract;

import java.util.Scanner;

public class PalindromeChecker {
    static Scanner sc =new Scanner(System.in);
    static Queue queue=new Queue();
    static StringBuilder reverse;


    public static void main(String[] args){
        System.out.println("Enter the string : ");
        String word = sc.next();
        int size=word.length();
        char[] convertedWord=new char[size];
        String[] firstString=new String[size];
        String[] secondString=new String[size];

        //====================================== converting string to char =======================================
        for(int i=0;i<size;i++) {
            convertedWord[i] = word.charAt(i);
            firstString=queue.enqueue(String.valueOf(convertedWord[i]));
        }
        queue.display(firstString);
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<size;i++) {
           secondString = queue.dequeue(firstString[i]);
        }
        for(int i=0;i<size;i++){
            if(secondString[i]!=null) {
                reverse = stringBuilder.append(secondString[i]);
            }
        }
        System.out.println("the reverse string is \n"+reverse);
        queue.display(secondString);

        if((word).equals(reverse.toString())){
            System.out.println("its palindrome");}
        else
            System.out.println("not palindrome");
    }

    }


