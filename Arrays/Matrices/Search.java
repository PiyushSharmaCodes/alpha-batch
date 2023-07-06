import java.util.Scanner;

public class Search {
    public static Boolean SearchInMatrix(int[][] array,int key) {
        int n = array.length;
        int m= array[0].length;
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j]==key) {
                    System.out.println("Element found at ("+i+","+j+")"+" Cell");
                    return true;
                }
            }
        }
        System.out.println("Element Not Found");
        return false;
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
        System.out.println("Enter The value to Search in Matrix");
        int key = sc.nextInt();
        System.out.println("Your Entered Matrix is :");
        SearchInMatrix(matrix,key);
        sc.close();
}
    
}