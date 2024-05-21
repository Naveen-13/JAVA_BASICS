package Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] given = {3,2,4,1,5};
        cyclicSort(given);
        System.out.println(Arrays.toString(given));
    }

    static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
