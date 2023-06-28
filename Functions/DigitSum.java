import java.util.Scanner;

public class DigitSum {
public static int SumOfDigit(int n) {
    int digit =0;
    int digitsum=0;
    while (n>0) {
        digit=n%10;
        digitsum+=digit;
        n/=10;
    }
    return digitsum;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for Digit Sum");
        int number = sc.nextInt();
        System.out.println("Sum of Digits of "+number+" is "+SumOfDigit(number));
        sc.close();
    }
}