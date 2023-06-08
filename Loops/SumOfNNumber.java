import java.util.Scanner;

public class SumOfNNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which you want sum of natural number ");
        int n= sc.nextInt();
        int sum=0;
        for (int i = 0; i <=n; i++) {
            sum=sum+i;
        }
        System.out.println("The sum of first "+ n + "natural number is "+sum);
    }
}
