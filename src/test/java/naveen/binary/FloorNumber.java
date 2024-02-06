package naveen.binary;

public class FloorNumber {

	public static void main(String[] args) {
		int[] arr = { 2, 6, 9, 34, 67, 89, 90, 104, 205, 607, 1092 };
		System.out.println(floor(arr, 88));

	}
	
	static int floor(int[] a, int target) {
		int start = 0;
		int end = a.length -1;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(a[mid] == target) {
				return mid;
			}
			if(target > a[mid]) {
				start = mid + 1;
			}else {
				end = mid - 1;
			}
			
		}
		return a[end];
	}

}
