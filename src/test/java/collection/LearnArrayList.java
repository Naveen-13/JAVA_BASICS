package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class LearnArrayList {

	public static void main(String[] args) {
		String[] g = {"hello", "java"};
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Name1");
		arrayList.add(1, "Karan");
		System.out.println(arrayList);
		arrayList.addAll(Arrays.asList(g));
		System.out.println(arrayList);

		int[] a = {3, 7, 2, 1, 80, 900, 23};

        // Convert array to ArrayList
        List<Integer> al = new ArrayList<>();
        for(int num:a) {
        	al.add(num);
        }
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
	}

}
