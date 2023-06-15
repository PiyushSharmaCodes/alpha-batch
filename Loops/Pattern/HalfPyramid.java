import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows in the Half Pyramid Pattern ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ;i++){
            for(int j = 1 ; j <= i ;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
