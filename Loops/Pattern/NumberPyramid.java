//     1     
//    2 2    
//   3 3 3   
//  4 4 4 4  
// 5 5 5 5 5 
import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        System.out.print("Enter the number of rown in the rhombus pattern: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i = 1 ; i <= n ;i++){
            for(int j = n-i ; j >0 ;j--){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ;j++){
                System.out.print(i+" ");
            }
            for(int j = n-i ; j >1 ;j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
