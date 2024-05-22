package Sorting;

public class InsertionSort {
    public static void main(String[] args){

    }

    public static void sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
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
