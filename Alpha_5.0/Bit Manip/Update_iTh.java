public class Update_iTh {
    public static int update(int n, int i, int newBit) {
        int mask = 1 << i;

        if (newBit == 1)
            return (n | mask);
        else
            return (n & (~mask));
    }

    public static void main(String[] args) {
        System.out.println(update(13, 2, 0));
    }
}
