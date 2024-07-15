package Sorting;

import java.util.Arrays;
// Selection sort is select an element and put it on the correct index
// so get the index which has max value
// run a loop and swap the max index value to lastindex value
// also on each iteration the lastindex value need to decreased as on first iteration the largest number will be at end
// so reduce lastindex = arr.length-1-i;
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

