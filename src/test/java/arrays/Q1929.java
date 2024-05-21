package arrays;

import java.util.HashMap;

public class Q1929 {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		System.out.println(numIdenticalPairs(arr));

	}
	
static int numIdenticalPairs(int[] nums) {
	HashMap<Integer,Integer> hm = new HashMap<>();
    int res = 0;
    for(int i = 0 ; i < nums.length ; i++ ){
        int n = nums[i];
        int count = hm.getOrDefault(n,0);
        res = res + count;
        hm.put(n,count+1);
    }
    return res;
        
    }

}
