import java.util.Scanner;

public class BinomialCofficient {
    public static int nCr(int n , int r) {
            int ncr = Factorial.Fact(n)/(Factorial.Fact(r)*Factorial.Fact(n-r));
            return ncr;
        }
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and r for binomial cofficient calculation: ");
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        System.out.print("Enter r value: ");
        int r = sc.nextInt();
        int cofficient_value=nCr(n, r);
        System.out.println("value of "+n+"C"+r+" is: "+cofficient_value);

    }
}
