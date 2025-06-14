
public class ClearLastIBits {

    private static int clearLastI(int n, int i) {
        int mask = (int) Math.pow(2, i) - 1; // to get the equivalent decimal of the range of bits
        return (n & ~mask);

    }

    public static void main(String[] args) {
        System.out.println(clearLastI(15, 3));
    }

}
