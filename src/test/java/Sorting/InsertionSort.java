package Sorting;

import java.util.Arrays;
// In Insertion sort we will sort the array in chunks i.e 0-1, 0-2, 0-3, 0-4, 0-5 ans so on 
//so or array will be sorted from the left
//also the i loop will be less tha length -1 cuz j = i+1
// if i go to the length then the j will get out of bound
public class InsertionSort {
    public static void main(String[] args){
        int[] given = {3,4,1,2,5};
        sort(given);
        System.out.println(Arrays.toString(given));
    }
    public static void sort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else break;
            }
        }
    }
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
