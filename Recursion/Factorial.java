import java.util.Scanner;

public class Factorial {
    public static int Fact(int n ) {
        if (n<=1) {
            return 1;
        }
        return n*Fact(n-1);
        
    }
    public static void main(String[] args) {
        System.out.print("Enter number to find factorial: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial of n is "+ Fact(n));
        sc.close();

    }
}
