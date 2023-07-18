import java.util.Scanner;

public class Operation {
    public static int GetIthBit(int num , int i ) {
        if ((num&(1<<i))==0) {
            return 0;
        } else {
            return 1;
        }
        
    }
    
    public static void main(String[] args) {
        System.out.println("Enter any number to check value of desired bit:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter bit number based on zero based indexing");
        int position = sc.nextInt();
        System.out.println("The value of desired bit is "+GetIthBit(num,position));
        sc.close();
    }
}
