package Sorting;

import java.util.Arrays;
// In bubble sort in each iteration the largest number will be put at the last index
//3, 1, 4, 2, 0
//1, 3, 2, 0, 4  // this is one complete iteration of j for loop for i = 0, pass 1 of i loop
// 1,2,0,3,4
// 1,0,2,3,4
//0,1,2,3,4
// Also on completion of one i loop the largest number will be at the end so there is not need to compare the last index number
// we will run the j loop till arr.length-i
public class BubbleSort {
    public static void main(String[] args) {
        int[] given = {1, 2, 3, 99, 5, 6};
        sort(given);
        System.out.println(Arrays.toString(given));
    }
    static void sort(int[] arr){
        boolean swapped;
        for(int i = 0; i < arr.length; i++){
            swapped = false;
            for(int j = 1; j<arr.length-i; j++){
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


