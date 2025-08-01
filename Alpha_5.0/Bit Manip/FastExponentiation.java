public class FastExponentiation {
    public static void main(String[] args) {
        System.out.println(expo(4,3));
    }

    private static int expo(int a, int n) {
        int ans=1;

        //log(n)
        while(n != 0){
            ans *= ((n&1) == 1)? a : 1;
            a *= a;
            n = n>>1;

        }
        return ans;
    }
}
