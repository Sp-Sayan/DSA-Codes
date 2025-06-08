public class Capitalize {

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        Character ch = str.charAt(0);
        // first character
        sb.append(Character.toUpperCase(ch));

        for (int i = 1; i < str.length(); i++) {
            ch = str.charAt(i);
            // check for first letter
            if (str.charAt(i - 1) == ' ')
                sb.append(Character.toUpperCase(ch));
            else
                sb.append(ch);

        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Hi, my name is Sayan  ";
        System.out.println(toUpperCase(str));
    }

}
