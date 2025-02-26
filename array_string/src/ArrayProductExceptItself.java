import java.util.Arrays;

public class ArrayProductExceptItself {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
    }
    public static int[] productExceptSelf(int[] nums) {
        int total=1;
        int hasZero = 0;
        //Calculate total and no. of zeroes
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0){
                total *= nums[i];

            }
            else{
                hasZero++;
            }
        }


        for(int i = 0; i<nums.length;i++){
            //if no. of zeroes more than 1 => all 0
            if(hasZero > 1){
                nums[i] = 0;
            }
            //if no. of zero == 1 => all 0 except the zero itself
            else if(hasZero == 1){
                if(nums[i] == 0 )
                    nums[i] = total;
                else
                    nums[i] = 0;
            }
            //product except itself = total product/itself;
            else{
                nums[i] = total/nums[i];
            }
        }
        return nums;
    }

}

