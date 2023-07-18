import java.util.Scanner;

public class Operation {
    public static int GetIthBit(int num , int i ) {
        if ((num&(1<<i))==0) {
            return 0;
        } else {
            return 1;
        }
        
    }
    // This logic is also giving the same result we are right shift the number until the desired bit become LSB the return the LSB
    public static int getIthBit(int num , int i ) {
        num=num>>(i); 
        
        int bit=num&1;
        return bit;
    }
    public static void main(String[] args) {
        System.out.println("Enter any number to check value of desired bit:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter bit number based on zero based indexing");
        int position = sc.nextInt();
        System.out.println("The value of desired bit is "+GetIthBit(num,position));
        System.out.println("The value of desired bit is "+getIthBit(num,position));
        sc.close();
    }
}
