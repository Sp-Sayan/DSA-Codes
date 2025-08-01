public class ClearRangeOfBits {




    public static void main(String[] args) {
        System.out.println(clearRange(2515,2,7));
    }

    private static int clearRange(int n, int i, int j) {
        int mask = ((1<<(j+1)) -1) - ((1<<i)-1) ;

        return (n & ~mask);
    }
}
