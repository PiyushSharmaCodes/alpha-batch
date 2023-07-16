import java.util.Scanner;

public class XOR {
    public static void main(String[] args) {
    System.out.println("Enter first Number: ");
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    System.out.println("Enter second Number: ");
    int num2 = sc.nextInt();
    System.out.println("Result of "+num1+" XOR "+num2 +" is "+(num1 ^ num2));
    sc.close();
}
}
