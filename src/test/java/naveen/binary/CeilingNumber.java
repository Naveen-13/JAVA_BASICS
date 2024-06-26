package naveen.binary;
//Ceiling number, the next number greater than the target number or equal
public class CeilingNumber {

	public static void main(String[] args) {
		int[] arr = { 2, 6, 9, 34, 67, 89, 90, 104, 205, 607, 1092 };
		System.out.println(ceiling(arr, 89));

	}

	static int ceiling(int[] a, int target) {
		int start = 0;
		int end = a.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (a[mid] == target) {
				return mid;
			}

			if (target > a[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}
		return a[start];
	}
}
