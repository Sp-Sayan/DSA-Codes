/*
You are given a string array of size N representing the amount of water (in liters) in tanks, each strictly between 0 and 1, and each with exactly one digit after the decimal point (for e.g., 0.6, 0.7, 0.3, etc.). Each number's ber's digit value is defined as the single digit after the decimal point. Your task is to find and return a string value representing tanks where the total water in all tanks to the left is exactly equal to the water in that tank plus the water in all tanks to the right.
 */


public class CTS1 {

    public static void main(String[] args) {
        String[] arr = {"0.3","0.2","0.3","0.6", "0.2"};
        System.out.println(findIdx(arr));;
    }

    private static String findIdx(String[] arr) {

        int[] leftSum = new int[arr.length];
        int[] rightSum = new int[arr.length];

        //calculate left sum
        leftSum[0] = 0;
        for (int i = 1; i < leftSum.length; i++) {
            leftSum[i] = leftSum[i-1] + Integer.parseInt(Character.toString(arr[i-1].charAt(2)));
        }

        //calculate right sum
        rightSum[arr.length - 1] = 0;
        for (int i = arr.length-2; i > -1 ; i--) {
            rightSum[i] = rightSum[i+1] + Integer.parseInt(Character.toString(arr[i+1].charAt(2)));
        }

        //find the tank
        for (int i = 0; i < arr.length; i++) {
            int curr = Integer.parseInt(Character.toString(arr[i].charAt(2)));
            if(leftSum[i] == curr + rightSum[i])
                return arr[i];
        }

        return null;
    }

}
