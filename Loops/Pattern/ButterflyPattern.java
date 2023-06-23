// *             * 
// * *         * * 
// * * *     * * * 
// * * * * * * * * 
// * * * * * * * * 
// * * *     * * * 
// * *         * * 
// *             * 
import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows in the Pattern: ");
        int n =sc.nextInt();
        int space=n-2;
        int stars=0;
        for(int i = 1 ; i <= n ;i++){
            if (i<=(n/2)) {
                stars=i;
            }
            if (i>(n/2+1)) {
                stars=n-i+1;
            }
        
            for(int j = 1 ; j <= stars ;j++){
                System.out.print("* ");
            }
            for(int j = 1 ; j <= space ;j++){
                System.out.print("  ");
            }
            for(int j = 1 ; j <= stars ;j++){
                System.out.print("* ");
            }
            if (i<(n/2)) {
                space-=2;
            }
            if (i>(n/2)) {
                space+=2;
            }
            System.out.println();
        }
    }
}
