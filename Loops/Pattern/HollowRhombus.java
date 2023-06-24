//         * * * * * 
//       *       *   
//     *       *     
//   *       *       
// * * * * * 
import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        System.out.print("Enter the number of rown in the rhombus pattern: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i = 0 ; i < n ;i++){
            for(int j = n-i ; j >1 ;j--){
                System.out.print("  ");
            }
            for(int j = 0 ; j < n ;j++){
                if (i==0||i==n-1||j==0||j==n-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
}
}