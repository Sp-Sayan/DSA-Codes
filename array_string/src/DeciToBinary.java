import java.util.Scanner;
public class DeciToBinary {
    static int toBinary(int x){
        int k=1,val,binary = 0;
        while(x>0){
            val = x%2;
            x /= 2;
            binary += val*k;
            k = k*10;
        }
        return binary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, binary;
        System.out.print("Enter Number: ");
        num = sc.nextInt();
        binary = DeciToBinary.toBinary(num);
        System.out.println("The Binary is: "+ binary);
    }
}
