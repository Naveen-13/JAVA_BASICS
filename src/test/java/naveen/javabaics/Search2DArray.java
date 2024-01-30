package naveen.javabaics;

public class Search2DArray {

	public static void main(String[] args) {
		int[][] arr = { 
				{ 4, 5, 66 }, 
				{ 45, 645, 242 }, 
				{ 23, 434, 43, 2 } };
		
		System.out.println(Search(arr, 43422));

	}

	static boolean Search(int[][] a, int target) {
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {					
				if(a[row][col] == target) {
					return true;
				}
			}
		}
		return false;
	}
	//Same function but returning the index of target element
	static int[] Search1(int[][] a, int target) {
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {					
				if(a[row][col] == target) {
					return new int[] {row, col};
				}
			}
		}
		return new int[] {-1, -1};
	}

}
