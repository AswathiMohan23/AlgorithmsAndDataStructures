package com.java.algorithms;

public class MergeSort {

    public static void main(String[] args){
        int[] array={4,12,3,8,46,1,90};
        int length=array.length;
        mergeSort(array,length);
        System.out.println("\nsorted array after carrying out mergeSort is : ");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void mergeSort(int[] array, int length) {
        if (length < 2) {
            return;
        }
        int mid = length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[length - mid];

        for (int i = 0; i < mid; i++) { //placing elements till mid element into left array
            leftArray[i] = array[i];
        }
        for (int i = mid; i < length; i++) { //placing elements after mid element into right array
            rightArray[i - mid] = array[i];
        }
        mergeSort(leftArray, mid); // sorting left array
        mergeSort(rightArray, length - mid); //sorting right array

        merge(array, leftArray, rightArray, mid, length - mid); // merging left and right arrays
    }

    public static void merge(int[] array, int[] leftArray, int[] rightArray, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < left) {
            array[k++] = leftArray[i++];
        }
        while (j < right) {
            array[k++] = rightArray[j++];
        }
    }
}