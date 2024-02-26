package interview;


import java.util.LinkedHashSet;

public class Question2 {
	// Remove the dublicate from string
	
	public static void main(String[] args) {
		String string = "Java";
		char[] a= string.toCharArray();
		StringBuilder sb = new StringBuilder();
		LinkedHashSet<Character> t = new LinkedHashSet<>();
		for( Character b : a) {
			t.add(b);
			sb.append(b);
		}
		System.out.println(sb);

	}

}
