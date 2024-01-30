package naveen.javabaics;

public class DigitProblem {

	public static void main(String[] args) {
		int[] arr = { 12, 3, 6, 1235, 14, 12, 123};
		System.out.println(find(arr));
		System.out.println(findViaString(arr));
	}

	static int find(int[] a) {
		int count = 0;
		for (int n : a) {
			int temp = n;
			int digitCount = 0;
			while (temp > 0) {
				digitCount++;
				temp = temp / 10;
			}
			if (digitCount % 2 == 0) {
				count++;
			}
		}
		return count;

	}

	static int findViaString(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			String s = Integer.toString(a[i]);
			if (s.length() % 2 == 0) {
				count++;
			}

		}

		return count;

	}

}
