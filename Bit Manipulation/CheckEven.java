import java.util.Scanner;

public class CheckEven {
    public static void main(String[] args) {
        System.out.println("Enter any number to check for even or odd :");
        Scanner sc = new Scanner(System.in);
        int  num = sc.nextInt();
        if ((num&1)==0) {
            // we are calculating AND of 1 with number to check the result is zero or not because here 1 is treated as a bit mask which element all the bits except the LSB
            System.out.println("Entered number is even ");
        }
        else{
            System.out.println("Entered number is odd ");
        }
        sc.close();
    }
}
