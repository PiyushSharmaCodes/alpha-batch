import java.util.Scanner;

public class SearchInSortedMatrix {
    
    public static int[] StairCaseSearch(int [][] matrix,int key) {
        int i=matrix.length-1;
        int j=0;
        while (i >=0 && j<matrix[0].length) {
            if (matrix[i][j]==key) {
                return new int[]{i,j};
            } else if (matrix[i][j]<key) {
                j++;
            }else{
                i--;
            }
        }
        return new int[]{-1,-1};
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
        System.out.println("Enter the value of key to search: ");
        int key = sc.nextInt();
        int[] result = StairCaseSearch(matrix, key);
        if (result[0]==-1 && result[1]==-1) {
            System.out.println("Element Not Found");
        }
        else{
            System.out.println("Element Found at ("+result[0]+","+result[1]+")");
        }
        sc.close();
    }

}
