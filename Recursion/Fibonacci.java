import java.util.Scanner;

public class Fibonacci {
    public static int Fib(int n) {
        if (n==1) {
            return 0;
        }
        if (n<=3) {
            return 1;
        }
        return Fib(n-1)+Fib(n-2);
    }
    public static void main(String[] args) {
    System.out.println("Enter the number :");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(Fib(n));
    sc.close();
    }
}
