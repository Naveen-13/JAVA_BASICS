package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] given = {3,1,4,2,5};
        sort(given);
        System.out.println(Arrays.toString(given));
    }
    static void sort(int[] arr){
        boolean swapped;
        for(int i = 0; i < arr.length; i++){
            swapped = false;
            for(int j = 1; j<arr.length; j++){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        
    }
    private static void swap(int[] arr, int j, int i) {
        int temp =  arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
