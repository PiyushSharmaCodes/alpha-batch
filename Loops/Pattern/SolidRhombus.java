//         * * * * * 
//       * * * * *   
//     * * * * *     
//   * * * * *       
// * * * * * 
import java.util.Scanner;

public class SolidRhombus {
    public static void main(String[] args) {
        System.out.print("Enter the number of rown in the rhombus pattern: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i = 0 ; i < n ;i++){
            for(int j = n-i ; j >1 ;j--){
                System.out.print("  ");
            }
            for(int j = 0 ; j < n ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
