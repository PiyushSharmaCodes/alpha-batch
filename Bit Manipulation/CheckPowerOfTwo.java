import java.util.Scanner;

public class CheckPowerOfTwo {
    public static int checkPowerOfTwo(int n ) {
        int b=n-1;
        return n&b;
    }
    public static void main(String[] args) {
        System.out.println("Enter number for power of two: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(checkPowerOfTwo(num)==0){
            System.out.println("Enter number is Power of Two");
        }
        else{
            System.out.println("Enter number is not Power of Two");
        }
        sc.close();
    }
    
}