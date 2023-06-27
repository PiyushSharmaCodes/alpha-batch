import java.util.Scanner;

public class BinaryToDecimal {
    public static int BinaryConversion(int a) {
    int decimal=0;
    int i=0;
    while(a!=0){
        int d = a%10;
        decimal += d*Math.pow(2,i);
        i++;
        a/=10;
    }
    return decimal;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary Number for conversion");
        int n = sc.nextInt();
        int value = BinaryConversion(n);
        System.out.println("Value of "+ n +" in decimal is "+value);
        sc.close();

    }
}
