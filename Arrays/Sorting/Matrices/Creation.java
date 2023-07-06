import java.util.Scanner;

public class Creation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows in the Matrix");
        int n = sc.nextInt();
        System.out.println("Enter Number of Columns in the Matrix");
        int m = sc.nextInt();
    
        int matrix[][]= new int[n][m];
        System.out.println("Enter Values for matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Your Entered Matrix is :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
        sc.close();
        
    }
}
