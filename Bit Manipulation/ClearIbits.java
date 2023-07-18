import java.util.Scanner;

public class ClearIbits {
    public static int resetIBits(int num , int i ) {
        int mask=((~0)<<i);
        return num&mask;
    }
    // I made this below logic for the mask at first i make the mask as 1 and then on every iteration i left shifted the mask by one bit and OR it with 1.After the iteration is over i take the NOT of the mask to get actual mask 

    // Made this logic only to increase understanding about mask and manipulation of bit for desired result
    public static int ResetIBits(int num , int i ) {
        if (i==0) {
            return num;
        }else{
            int mask=1;
        for (int j = 1; j < i; j++) {
            mask=mask<<1;
            mask=mask|1;
        }
        mask=~mask;
        return num&mask;
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Enter any number to set the desired bit:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter number of bits to clear from end:");
        int no_of_bits = sc.nextInt();
        System.out.println("The value of number enterd by clearing last "+no_of_bits+" bits "+resetIBits(num,no_of_bits));
        System.out.println("The value of number enterd by clearing last "+no_of_bits+" bits "+ResetIBits(num,no_of_bits));
        
        sc.close();
    }
}
