package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class LearnArrayList {

	public static void main(String[] args) {
		String[] g = {"hello", "java"};
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Name1");
		arrayList.add(1, "Karan");
		System.out.println(arrayList);
		arrayList.addAll(Arrays.asList(g));
		System.out.println(arrayList);
	}

}
