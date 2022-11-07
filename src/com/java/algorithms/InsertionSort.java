package com.java.algorithms;

public class InsertionSort {
    public static void main(String[] args){
        String[] array = {"pineapple","grapes","apple", "kiwi", "mango" };
        String sortedArray[] = sortingArray(array, array.length);
        System.out.println("\nArray after carrying out insertion sort : \n");
        for(int i=0;i<sortedArray.length;i++){
            System.out.println(sortedArray[i]);
        }
    }

    public static String[] sortingArray(String array[], int length){
        String temp="";
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(array[i].compareToIgnoreCase(array[j])>0){
                    temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                    }
            }
        }
        return array;
    }
}
