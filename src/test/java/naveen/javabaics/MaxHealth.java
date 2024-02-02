package naveen.javabaics;

public class MaxHealth {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3}, {2,5,8}, {4,9,1}};
		System.out.println(max(arr));

	}

	static int max(int[][] a) {
		int ans = Integer.MIN_VALUE;
		for (int row = 0; row < a.length; row++) {
			int rowSum = 0;
			for (int col = 0; col < a[row].length; col++) {
				rowSum = rowSum + a[row][col];
			}
			if(rowSum > ans) {
				ans = rowSum;
			}
		}
		return ans;
	}

}
