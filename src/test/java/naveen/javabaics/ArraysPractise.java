package naveen.javabaics;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractise {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int [5];
		
		for(int i = 0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		for ( int i : a) {
			System.out.print(i + " ");
		}
		sc.close();

	}

}
