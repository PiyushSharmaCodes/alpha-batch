import java.util.Scanner;

public class Factorial {
    public static int Fact(int n) {
        int fact=1;
        for(int i = 1 ; i <= n ;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number for  which you want Factorial: ");
        int n = sc.nextInt();
        int factorial = Fact(n);
        System.out.println("Factorial of "+n+" number is : "+ factorial);
        sc.close();
    }
}
