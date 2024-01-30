package naveen.javabaics;

import java.util.Scanner;

public class TwoDimesnsion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] a = new int[3][3];
		System.out.println(a.length);
		
		for(int row = 0; row<a.length; row++) {
			for(int col = 0; col < a[row].length; col++) {
				a[row][col] = sc.nextInt();
			}
			System.out.println();
		}
		
		for(int row = 0; row<a.length; row++) {
			for(int col = 0; col < a[row].length; col++) {
				System.out.print(a[row][col] + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
