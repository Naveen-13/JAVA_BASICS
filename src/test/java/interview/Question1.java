package interview;

public class Question1 {
	//given the input string = "sky is blue and vast"
	//Print only the even length words in o/p
	public static void main(String[] args) {
		String givenString = "Sky is blue and vast hello";
		String[] arr=givenString.split(" ");	
		for(String a : arr) {
			if(a.length()%2 == 0) {
				System.out.println(a);
			}
		}

	}

}
