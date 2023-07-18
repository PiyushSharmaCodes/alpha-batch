import java.util.Scanner;

public class ClearIthBit {
    public static int resetIthBit(int num , int i ) {
        int mask=~(1<<i);
        return num&mask;
    }
    public static void main(String[] args) {
        System.out.println("Enter any number to set the desired bit:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter bit number based on zero based indexing");
        int position = sc.nextInt();
        System.out.println("The value of number enterd with the desired bit set is "+resetIthBit(num,position));
        
        sc.close();
    }
}
