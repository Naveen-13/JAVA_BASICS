package naveen.binary;

public class LC744 {

	public static void main(String[] args) {
		char letters[] = {'c', 'f', 'j'};
		System.out.println(binarySearch(letters, 'j'));
	}
	public static char binarySearch(char[] a, char target) {
		int start = 0;
		int end = a.length -1 ;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(target >= a[mid]) {
				start = mid + 1;
			}
			else {
				end = mid -1;
			}

			// if(target < a[mid]){
			// 	end = mid -1;
			// }
			// else start = mid +1;
		}
		return a[start % a.length];
		

}
}