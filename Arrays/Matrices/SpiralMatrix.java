import java.util.Scanner;

public class SpiralMatrix {
    public static void PrintSpiral(int matrix[][]) {
        int startrow=0;
        int endrow=matrix.length-1;
        int startcolumn=0;
        int endcolumn=matrix[0].length-1;
        while (startrow<=endrow && startcolumn<=endcolumn) {
            //top
            for(int j = startcolumn ; j <= endcolumn ;j++){
                System.out.print(matrix[startrow][j]+" ");
            }
            //right
            for(int i = startrow +1 ; i <= endrow ;i++){
                System.out.print(matrix[i][endcolumn]+" ");
            }
            // bottom
            for(int j = endcolumn-1 ; j >= startcolumn ;j--){
                if (startcolumn==endcolumn) {
                    break;
                }
                
                System.out.print(matrix[endrow][j]+" ");
            }
            // left
            for(int i = endrow-1 ; i >=startrow+1 ;i--){
                if (startrow==endrow) {
                    break;
                }
                System.out.print(matrix[i][startcolumn]+" ");
            }
            startrow++;
            endrow--;
            startcolumn++;
            endcolumn--;
        }

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
    System.out.println("Printing Element of Matrix in Spiral way:");
    PrintSpiral(matrix);    
       
        sc.close();
}  
}
