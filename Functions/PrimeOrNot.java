import java.util.Scanner;

public class PrimeOrNot {
    public static boolean primecheck(int n) {
        boolean prime=true;
        for(int i = 2 ; i <= Math.sqrt(n) ;i++){
            if (n%i==0) {
                prime = false;
            }
        }
        return prime;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number for prime check: ");
    int n = sc.nextInt();
    boolean check = primecheck(n);
    if (check==true) {
        System.out.println("Number is prime");
    } else {
        System.out.println("Number is not prime");
    }
}
    
}