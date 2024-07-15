package collection;

import java.util.Arrays;

public class Practise {
    public static void main(String[] args) {
        int[] nums = {1, 0 , 12, 14, 11, 144};
        Practise.bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    
public static void bubbleSort(int[] nums){
    boolean swapped;
    for(int i = 0; i < nums.length; i++){
    swapped = false;
    for(int j =1; j<nums.length; j++){
    if(nums[j-1] > nums[j]){
    swap(nums, j-1, j);
        swapped =true;
    }
    }
    if(!swapped){
        break;
    }
    }
    
    }
    
    public static void swap(int[] nums, int i, int j){
         int temp = nums[j];
         nums[j] = nums[i];
         nums[i] = temp;
    }
    
}
