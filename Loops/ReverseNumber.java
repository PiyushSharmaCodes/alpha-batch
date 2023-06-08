import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to which you want to print number");
        int n= sc.nextInt();
        int givennumber=n;
        int reverse=0;
        while(n!=0){
            reverse=reverse*10+(n%10);
        n/=10;      
      }
      System.out.println("The reverse of "+ givennumber +" is "+reverse);
    }
}
