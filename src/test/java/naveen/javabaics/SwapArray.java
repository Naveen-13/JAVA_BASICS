package naveen.javabaics;

import java.util.Arrays;

public class SwapArray {

	public static void main(String[] args) {
		int[] arr = {3, 4, 6, 22, 90, 899};
		swap(arr, 0, 4);
		System.out.println(Arrays.toString(arr));
		System.out.println(max(arr));
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	
	}
	static void swap(int[] a, int index1, int index2) {
		int temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;			
	}
	static int max(int[] a) {
		int max = 0;
		for(int i = 0; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}	
	
	static void reverse(int[] a) {
		int start = 0;
		int end = a.length-1;
		
		while(start < end) {
			int temp =  a[start];
			a[start] =  a[end];
			a[end] = temp;
			start ++;		
			end --;
		}
	}

}
