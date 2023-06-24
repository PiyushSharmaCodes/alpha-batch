//       *       
//     * * *     
//   * * * * *   
// * * * * * * * 
// * * * * * * * 
//   * * * * *   
//     * * *     
//       * 
import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        System.out.print("Enter the number of rown in the rhombus pattern: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int spaces=n/2-1;
        int stars= 1 ;
        for(int i = 1 ; i <= n ;i++){
            for(int j = 1 ; j <= spaces ;j++){
                System.out.print("  ");
            }
            for(int j = 1 ; j <= stars ;j++){
                System.out.print("* ");
            }
            for(int j = 1 ; j <= spaces ;j++){
                System.out.print("  ");
            }
            if (i<n/2) {
                stars+=2;
                spaces-=1;
            } 
            if (i>n/2) {
                stars-=2;
                spaces+=1;
            } 

            System.out.println();
        }
    }
        
}
