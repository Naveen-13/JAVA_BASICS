package Sorting;

public class LC268 {
    public static void main(String[] args) {
        int[] given = {4,0,2,1};
        System.out.println(missingNumber(given));
    }
    public static int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        for(int index = 0; index<nums.length; index++){
            if(nums[index] != index){
                return index;
            }
        }
        return nums.length;
    }
    public static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;

    }
}
