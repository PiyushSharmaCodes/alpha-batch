import java.util.Scanner;

public class Palindrome {
    public static boolean CheckPallindrome(int n) {
        int reverse = 0;
        int number =n;
        while (number!=0) {
            int digit = number %10;
            reverse=reverse *10 +digit;
            number/=10;
            
        }
        if(n==reverse){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to check for palindrome");
        int n=sc.nextInt();
        if (CheckPallindrome(n)) {
            System.out.println("Given Number is Pallindrome");
        } else {
            System.out.println("Given number is not Pallindrome");
        }
        sc.close();
    }
}
