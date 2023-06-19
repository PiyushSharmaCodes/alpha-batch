// 1 2 3 4 5 
// 1 2 3 4   
// 1 2 3     
// 1 2       
// 1
import java.util.Scanner;

public class InvertedAndRotatedHalfPyramidWithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows in the Pattern");
        int n = sc.nextInt();
        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < n-i ;j++){
                System.out.print(j+1+" ");
            }
            for(int j = 0 ; j < i ;j++){
                System.out.print("  ");
            }
            System.out.println();
            
        }
    }
}
