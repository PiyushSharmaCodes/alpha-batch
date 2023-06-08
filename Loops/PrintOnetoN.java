import java.util.Scanner;

public class PrintOnetoN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to which you want to print number");
        int n= sc.nextInt();
        for (int i = 1; i < n+1; i++) {
            System.out.println(i);
        }
    }
}