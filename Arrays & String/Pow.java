package com.sayan;

public class Pow {

    public static void main(String[] args) {
        System.out.println(myPow(2.00000,-2147483648));
    }

    public static double myPow(double x, int n) {
        long pow = n;
        if(n < 0)
        {
            x = 1/x;
            pow = -pow;
        }
        System.out.println(pow);
        return power(x,pow/2) * 2;
    }

    public static double power(double x, long n){
        if(x == 1)
            return x;
        else{
            if(n == 0)
                return 1;
            else if(n==1)
                return x;
            else
                return x*power(x,n-1);
        }
    }
}
