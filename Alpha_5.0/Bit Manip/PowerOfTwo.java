

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(check(16));
    }

    private static boolean check(int n) {

        return (n & (n-1)) == 0;
    }


}
