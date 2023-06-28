import java.util.Scanner;
public class DecimalToBinary {
    public static int DecimalConversion(int a) {
    int  binary=0;
    int i=0;
    while(a!=0){
        int d = a%2;
        a/=2;
         binary += d*Math.pow(10,i);
        i++;
        
    }
    return  binary;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal Number for conversion");
        int n = sc.nextInt();
        int value = DecimalConversion(n);
        System.out.println("Value of "+ n +" in Binary is "+value);
        sc.close();

    }
}


