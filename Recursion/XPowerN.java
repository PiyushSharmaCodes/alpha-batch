import java.util.Scanner;

public class XPowerN {
    public static int FindPower(int n , int p) {
        if (p==0) {
            return 1;
        }
        return n*FindPower(n, p-1);
    }
    public static int FindPowerOptm(int n , int p) {
        if (p==0) {
            return 1;
        }
        int halfPower=FindPower(n,p/2);
        int halfPowerSquare=halfPower*halfPower;
        if (n%2!=0) {
            halfPowerSquare*=n;
        }
        return halfPowerSquare;
    }
    public static void main(String[] args) {
        System.out.println("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter Power: ");
        int p=sc.nextInt();
        System.out.println(n+" to the power of "+p+" is "+ FindPowerOptm(n, p));
        sc.close();
    }
}
