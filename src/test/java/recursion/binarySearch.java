package recursion;

public class binarySearch {

	public static void main(String[] args) {
		int a[] = {9, 12, 23, 33, 45, 202, 333};
		int target = 9;
		System.out.println(binary(a, target, 0, a.length-1));

	}
	
	static int binary(int arr[], int target, int s, int e) {
		if(s > e) {
			return -1;
		}
		int m = s + (e-s) / 2;
		
		if(arr[m] == target) {
			return m;
		}
		if(target < arr[m]) {
			return binary(arr, target, s, m-1);
		}
		return binary(arr, target, m + 1, e);
		
	}

}
