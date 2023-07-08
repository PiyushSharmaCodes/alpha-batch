import java.util.Scanner;

public class DiagonalSum {
    public static int AddDiagonal(int matrix[][]) {
        int sum=0;
        int n =matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i==j) {
                    sum+=matrix[i][j];
                }
                else if (i+j==n-1) {
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    
    }
    public static int AddDiagonalOptimised(int matrix[][]) {
        int sum=0;
        for (int i = 0; i < matrix.length; i++) {
            sum+=matrix[i][i];
            if (i!=matrix.length-i-1) {
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    
    }
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
    int result1=AddDiagonalOptimised(matrix);
    System.out.println("Sum of all diagonal elements from Optimised Code is: "+result1);
    int result2=AddDiagonal(matrix);
    System.out.println("Sum of all diagonal elements from BruteForce is: "+result2);
        sc.close();
    }
}
