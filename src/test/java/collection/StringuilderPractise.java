package collection;

public class StringuilderPractise {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        sb.insert(2, 'n');
        System.out.println(sb);

        sb.deleteCharAt(2);
        System.out.println(sb);

        sb.append(" stark");  // append is used to add at the end
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}
