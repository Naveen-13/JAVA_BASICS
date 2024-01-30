package naveen.javabaics;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {4, 5, 8, 99, 44, -6644};
		System.out.println(Search(arr, 99));
		System.out.println(maxvalue(arr));
		System.out.println(minValue(arr));

	}
	static boolean Search(int[] a, int target) {
		for(int i = 0; i<a.length; i++) {
			if(a[i] == target)
				return true;
		}			
		return false;
	}
	
	static boolean SearchRange(int[] a, int target, int start, int end) {
		for(int i = start; i<=end; i++) {
			if(a[i] == target)
				return true;
		}
		return false;
	}
	static int maxvalue(int[] a) {
		int max = a[0];
		for(int i = 0; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
		
	}
	
	static int minValue(int[] a) {
		int min = a[0];
		for (int i = 0; i<a.length; i++) {
			if(a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

}
