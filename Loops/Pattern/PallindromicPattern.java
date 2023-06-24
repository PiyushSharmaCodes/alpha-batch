//         1
//       2 1 2       
//     3 2 1 2 3     
//   4 3 2 1 2 3 4   
// 5 4 3 2 1 2 3 4 5 
import java.util.Scanner;

public class PallindromicPattern {
public static void main(String[] args) {
    System.out.print("Enter the number of rows in the Pattern: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int value=1;
    for(int i = 1 ; i <= n ;i++){
        for(int j = 1 ; j <= n-i ;j++){
            System.out.print("  ");
        }
        for(int j = i ; j >= 1 ;j--){
            System.out.print(j+" ");
        }
        for(int j = 2; j <= i ;j++){
            System.out.print(j+" ");
        }
        for(int j = 1 ; j <= n-i ;j++){
            System.out.print("  ");
        }
        System.out.println();
    }
}
    
}