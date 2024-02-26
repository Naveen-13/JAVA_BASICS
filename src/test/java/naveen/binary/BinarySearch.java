package naveen.binary;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 7, 8, 9, 12, 22, 45, 56, 78, 89, 990, 1234 };

		System.out.println(Search(arr, 9905));

	}

	static int Search(int[] a, int target) {
		int start = 0;
		int end = a.length - 1;
		int mid = 0;

		while (end >= start) {
			mid = start + (end - start) / 2;
			if (target < a[mid]) {
				end = mid - 1;
			} else if (target > a[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;	

	}

}
