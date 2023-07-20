import java.util.Scanner;

public class ClearItoJBits {
    public static int clearItoJ(int num,int i,int j ) {
        int a=(~0)<<j+1;
        int b = (~0)<<i;
        b=~b;
        int mask=a|b;
        return mask&num;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Enter the starting position :");
        int i =sc.nextInt();
        System.out.println("Enter the ending position :");
        int j =sc.nextInt();
        System.out.println("The resultant number by clearing the desired: "+clearItoJ(num, i, j));
    }
}
