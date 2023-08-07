import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Print(n);
        sc.close();

    }
    public static void Print(int n) {
        if (n==0) {
            return;
        }
        System.out.print(n+" ");
        Print(n-1);
    }
}
