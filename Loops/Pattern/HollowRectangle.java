// * * * * * * * 
// *           * 
// *           * 
// *           * 
// * * * * * * * 

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows and column in hollow rectangle: ");
        System.out.println("Enter the number of rows ");
        int row=sc.nextInt();
        System.out.println("Enter the number of rows ");
        int column=sc.nextInt();
        for(int i = 0 ; i < row ;i++){
            for(int j = 0 ; j < column ;j++){
                if (i==0 || i== row-1 || j==0||j==column-1) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
