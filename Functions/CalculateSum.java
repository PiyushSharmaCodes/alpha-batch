import java.util.Scanner;

public class CalculateSum {
public static int Sum(int a,int b) {//Parameter or formal parameters
    int sum = a+b;
    return sum;
}

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter First number: ");
        num1=sc.nextInt();
        System.out.print("Enter Second number: ");
        num2=sc.nextInt();
        int sum = Sum(num1, num2);//Arguments or Actual Parameters
            
        System.out.print("Sum of given number is "+sum+"\n");
        sc.close();
}
}
