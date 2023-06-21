// 1     
// 0 1   
// 1 0 1 
// 0 1 0 1   
// 1 0 1 0 1 
import java.util.Scanner;

public class ZeroOneTriangle {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows in the Pattern: ");
        int n =sc.nextInt();
        int value;
        for(int i = 1 ; i <= n ;i++){
            if (i%2==0) {
                value=0; 
            }
            else{
                value=1;
            }
            for(int j = 1 ; j <= i ;j++){
                System.out.print(value+" ");
                value=1-value;
            }
            System.out.println();
        }
    }
}
