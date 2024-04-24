package naveen.binary;

import java.util.Arrays;

public class LC34 {
    public static void main(String[] args) {
        int[] nums = {5,7,8,8,10,7,8};
        int[] result = searchRange(nums, 7);
        System.out.println(Arrays.toString(result));


    }
    public static int[] searchRange(int[] num, int target){
        int[] ans = {-1, -1};
        //check first occurence
        int start = Search(num, target, true);
        int end = Search(num, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
        
    }
    
    public static int Search(int num[], int target, boolean findthefirstindex) {
    	int start = 0;
    	int end = num.length-1;
    	int ans= -1;
    	while (start<=end) {
			int mid =start + (end-start)/2;
			if(target < num[mid]) {
				end = mid -1;
			}
			else if (target > num[mid]) {
				start = mid +1;
			}
			else {
				//potential answer found
				ans = mid;
				if(findthefirstindex) {
					end = mid -1;
				}
				else {
					start = mid +1;
				}
			}
		}
    	return ans;
    }
}