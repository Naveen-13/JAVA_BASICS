package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        String a = "Hello";
        int[] arr = {3,2,6,5,0,3};
        // test.getCharacters(a);
        // test.swapNum(12345);
        // test.palindrome(1213);
        // test.palindromeString("nitin");
        // test.secondLargest(arr);
        // test.vowel("Hello world");
        // test.abced("abcd");
        // System.out.println(test.incrementeachdigit(4567));
        // System.out.println(test.increment(4532));
        // test.evenWords("sky is blue and vast");
        // System.out.println(Arrays.toString(test.method(arr, 5)));
        //System.out.println(test.removeDuplicates(arr));
        System.out.println(test.maxProfit(arr));
    }
    // public static int[] productExceptSelf(int[] nums){}
    //     t
    // }
    public static int maxProfit(int[] prices){
        int lsp = Integer.MAX_VALUE;
        int pist = 0;
        int op = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i] < lsp){
                lsp = prices[i];
            }
            pist = prices[i] - lsp;
            if( op < pist){
                op = pist;
            }
        }
        return op;
    }

    public static int removeDuplicates(int[] nums){
        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        for(int num:nums){
            ls.add(num);
        }
        System.out.println(ls);
        return ls.size();
    }
    public static int[] method(int[] nums, int target){

        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
            }
        }
    } return null;
        
    }

    public static void evenWords(String str){
        String[] arrs = str.split(" ");
        ArrayList<String> result =  new ArrayList<>();
        for(String arr : arrs){
            if(arr.length()%2==0){
                result.add(arr);
            }
        }
        System.out.println(result);
    }

    public static void getCharacters(String a) {

        HashMap<Character, Integer> countMap = new HashMap<>();
        for (char c : a.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        for (HashMap.Entry<Character, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void swapNum(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        System.out.println(rev);
    }

    public static void palindrome(int n) {
        int temp = n;
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        if (temp == rev)
            System.out.println(temp + " Number is palindrome");
        else
            System.out.println(temp + " Number is not a palindrome");
    }

    public static void palindromeString(String a) {
        String rev = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            rev = rev + a.charAt(i);
        }
        if (a.equals(rev))
            System.out.println(a + " is palindrome");
        else
            System.out.println(a + " is not a palindrome");

    }

    public static void secondLargest(int[] a) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : a) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        System.out.println(secondMax);

    }

    public static void vowel(String a) {
        Map<Character, Integer> vowelCount = new HashMap<>();
        vowelCount.put('a', 0);
        vowelCount.put('e', 0);
        vowelCount.put('i', 0);
        vowelCount.put('o', 0);
        vowelCount.put('u', 0);
        a = a.toLowerCase();
        for (char c : a.toCharArray()) {
            if (vowelCount.containsKey(c)) {
                vowelCount.put(c, vowelCount.get(c) + 1);
            }
        }
        for (HashMap.Entry<Character, Integer> entry : vowelCount.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    public static void abced(String a) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            int repeatcount = i + 1;
            for (int j = 0; j < repeatcount; j++) {
                result.append(c);
            }
        }
        System.out.println(result.toString());
    }

    public static int incrementeachdigit(int num) {
        // converting number into string
        String str = String.valueOf(num);
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            int incrementvalue = Character.getNumericValue(c) + 1;
            StringBuilder a =sb.append(incrementvalue);
            System.out.println(a);
        }
        return Integer.parseInt(sb.toString());
    }

    public static int increment(int num) {
        String str = String.valueOf(num);
        ArrayList<Integer> al = new ArrayList<>();
        for (char c : str.toCharArray()) {
            int incrementvalue = Character.getNumericValue(c) + 1;
            al.add(incrementvalue);
        }
        int number = 0;
        for (int als : al) {
            number = number * 10 + als;
        }
        return number;

    }
}
