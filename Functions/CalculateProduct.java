import java.util.Scanner;

public class CalculateProduct {
    public static int Product(int a,int b) {//Parameter or formal parameters
    int product = a*b;
    return product;
}
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter First number: ");
        num1=sc.nextInt();
        System.out.print("Enter Second number: ");
        num2=sc.nextInt();
        int product = Product(num1, num2);//Arguments or Actual Parameters
        System.out.print("Product of given number is "+ product);
        sc.close();
}
}
