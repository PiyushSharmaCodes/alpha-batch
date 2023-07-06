import java.util.Scanner;

public class SmallestInMatrix {
    
    public static int Smallest(int[][] array) {
        int smallest=Integer.MAX_VALUE;
        int n = array.length;
        int m= array[0].length;
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j]<smallest) {
                    smallest=array[i][j];
                }
            }
        }
        return smallest;
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
        int result  = Smallest(matrix);
        System.out.println("Smallest Element in the Matrix is :"+result);
        sc.close();
}  
}

