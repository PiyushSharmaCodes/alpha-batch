import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows in the Pattern: ");
        int n =sc.nextInt();
        int count =1;
        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j <= i ;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
