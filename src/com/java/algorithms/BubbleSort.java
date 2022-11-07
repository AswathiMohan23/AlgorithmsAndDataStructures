package com.java.algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] array={7,3,1,4,6,2,5};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void sort(int[] array){
        for(int i=0;i<array.length;i++){
            for (int j=1;j< array.length;j++){
                if(array[j]<array[j-1]){
                    swapping(array,i,j);
                }
            }
        }
    }
    public static void swapping(int[] array, int i, int j) {
        int temp=array[j];
        array[j]=array[j-1];
        array[j-1]=temp;
    }
}
