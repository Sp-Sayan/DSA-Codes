/*

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */


package com.sayan;

public class ReverseInt {
    public static void main(String[] args) {
        int num = 2147483412;
        System.out.println("NUM: "+num);
        System.out.println(reverse(num));
    }
    public static int reverse(int x) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        //System.out.println(max);
        int digits,newNum=0;
        int k = x;
        boolean overflow=false;
        if(x <0) {
            k = -x;
        }
        while(k>0){
            digits = k%10;
            newNum = (newNum*10) + digits;
            System.out.println(newNum);
            if(newNum > max/10 && k > 9)
                overflow=true;
            k/=10;

        }
        if(x<0)
            newNum *= -1;
        //System.out.println("NEW NUM: "+newNum);
        if(overflow)
            return 0;
        else{
            return newNum;
        }

    }

}
