import java.util.Scanner;

public class PrimeInRange {
    private static void PrintPrime(int x,int y) {
        for(int i = x ; i <= y ;i++){
            if (PrimeOrNot.primecheck(i)) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start and end number for printing prime number between them : ");
        System.out.print("Enter start number : ");
        int a=sc.nextInt();
        System.out.print("Enter End number : ");
        int b=sc.nextInt();
        PrintPrime(a, b);
        sc.close();
    }
}
