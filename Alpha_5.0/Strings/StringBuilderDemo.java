public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        // O(26) or O(n)
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb.length() + "," + sb.capacity());
    }
}
