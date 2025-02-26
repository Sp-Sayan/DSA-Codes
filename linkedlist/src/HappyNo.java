public class HappyNo {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = squarer(slow);
            fast = squarer(squarer(fast));
            if(slow == 1)
                return true;

        }while(slow != fast);

        return false;

    }

    public int squarer(int x){
        int digit;
        int ans=0;
        while(x>0){
            digit = x%10;
            ans += digit*digit;
            x /= 10;
        }
        return ans;
    }
}
