import java.util.Scanner;

public class SumToN {
    public static int Sum(int n) {
        if (n==1) {
            return 1;
        }
        return n + Sum(n-1);

    }
public static void main(String[] args) {
    System.out.print("Enter the natural number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Sum of all natural number upto " + n +" is " + Sum(n));
    sc.close();
}
    
}