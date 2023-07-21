import java.util.Scanner;

public class CountSetBits {
    public static int numberOfSetBits(int num) {
        int count=0;
        while (num!=0) {
            if ((num&1)==1) {
                count++;
            }
            num=num>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Enter number to count number of set bits: ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Number of set bits in "+num+" is "+numberOfSetBits(num));
    }
}
