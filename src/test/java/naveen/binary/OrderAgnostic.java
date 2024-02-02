package naveen.binary;

public class OrderAgnostic {

	public static void main(String[] args) {
		int[] arr = { 999, 455, 345, 90, 78, 22, 10, 9 };
		System.out.println(ogbs(arr, 21));
	}

	static int ogbs(int[] a, int target) {
		int s = 0;
		int e = a.length - 1;

		boolean isAsc = a[e] > a[s];

		while (e >= s) {
			int mid = s + (e - s) / 2;
			if (a[mid] == target) {
				return mid;
			}
			if (isAsc) {
				if (target > a[mid]) {
					s = mid + 1;
				} else {
					e = mid - 1;
				}
			} else {
				if (target < a[mid]) {
					s = mid + 1;
				} else {
					e = mid - 1;
				}

			}
		}
		return -1;

	}
}
