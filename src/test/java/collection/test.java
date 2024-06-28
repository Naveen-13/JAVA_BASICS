package collection;

import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        String a = "Hello";
        int[] arr = {13,14,1,4,5,6,7};
        test.getCharacters(a);
        test.swapNum(12345);
        test.palindrome(1213);
        test.palindromeString("nitin");
        test.secondLargest(arr);
        test.vowel("Hello world");
        test.abced("abcd");
    }

    public static void getCharacters(String a){

        HashMap<Character, Integer> countMap = new HashMap<>();
        for(char c: a.toCharArray()){
            countMap.put(c, countMap.getOrDefault(c, 0)+ 1);
        }
        for(HashMap.Entry<Character, Integer> entry: countMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void swapNum(int n){
        int rev = 0;
        while(n!=0){
            rev = rev*10 + n%10;
            n=n/10;
        }
        System.out.println(rev);
    }

    public static void palindrome(int n){
        int temp = n;
        int rev = 0;
        while(n!=0){
            rev = rev*10 + n%10;
            n = n/10;
        }
        if(temp==rev)System.out.println(temp + " Number is palindrome");
        else System.out.println(temp + " Number is not a palindrome");
    }

    public static void palindromeString(String a){
        String rev = "";
        for(int i=a.length()-1; i>=0; i--){
            rev = rev + a.charAt(i);
        }
        if(a.equals(rev))System.out.println(a + " is palindrome");
        else System.out.println(a + " is not a palindrome");

    }

    public static void secondLargest(int[] a){
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int num: a){
            if(num>max){
                secondMax = max;
                max = num;
        }  
        else if(num>secondMax && num!=max){
            secondMax = num;    
        }
    }
    System.out.println(secondMax);
					
	}
    
    public static void vowel(String a){
        Map<Character, Integer> vowelCount = new HashMap<>();
        vowelCount.put('a', 0);
        vowelCount.put('e', 0);
        vowelCount.put('i', 0);
        vowelCount.put('o', 0);
        vowelCount.put('u', 0);
         a = a.toLowerCase();
         for(char c : a.toCharArray()){
            if(vowelCount.containsKey(c)){
                vowelCount.put(c, vowelCount.get(c)+1);
            }
         }
         for(HashMap.Entry<Character, Integer> entry : vowelCount.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
         }
         
    }

    public static void abced(String a){
        StringBuilder result = new StringBuilder();
        for(int i=0;i<a.length();i++){
            char c = a.charAt(i);
            int repeatcount = i+1;
            for(int j=0; j<repeatcount; j++){
                result.append(c);
            }
        }
        System.out.println(result.toString());
    }


}
