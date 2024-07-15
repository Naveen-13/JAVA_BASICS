package collection;

import java.util.LinkedList;

public class LearLinkedList {

	public static void main(String[] args) {
		LinkedList<String> arrayList = new LinkedList<String>();
		arrayList.add("Name1");
		arrayList.add(1, "Karan");
		arrayList.add("jquery");
		arrayList.addLast("python");
		System.out.println(arrayList);
		arrayList.pop();
		System.out.println(arrayList.peek());
		System.out.println(arrayList);
		
		arrayList.clear();
		System.out.println(arrayList.peek());
		System.out.println(arrayList.getFirst());

	}

}
