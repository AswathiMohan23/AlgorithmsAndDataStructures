package com.java.unorderedLinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class UnorderedList<T extends Comparable> {
    static Scanner sc=new Scanner(System.in);
    static LinkedList<String>list=new LinkedList<>();
    static NodeClassMethods nodeClassMethods=new NodeClassMethods();
    static Node node=new Node();
    public static void main(String[] args){
        LinkedList<String>list=new LinkedList<>();

        String text="hi how are you";
       // String[] words=new String[20];
        int textSize=text.length();
        String words[] = text.split(" ");
        for(String i : words) {
            nodeClassMethods.append(i);
            list.add(i);
        }
        nodeClassMethods.display();
        System.out.println("Enter a word to search : ");
        String word=sc.next();
        boolean result=list.contains(word);
        if(result==true)
            System.out.println("present");
        else {
            list.add(word);
            System.out.println("the word is absent so after adding this new element is : \n"+list);
        }
    }
}
