package Sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args){
        int[] given = {3,4,1,2,5};
        sort(given);
        System.out.println(Arrays.toString(given));
    }
    static void sort(int[] arr){
        for(int i = 0; i <  arr.length; i++){
            int lastIndex = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }
    public static int getMaxIndex(int[] arr, int first, int end){
        int max = first;
        for(int i = first; i<=end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
     static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
