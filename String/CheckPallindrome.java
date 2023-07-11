import java.util.Scanner;

public class CheckPallindrome {
    public static void main(String[] args) {
        System.out.println("Enter the to check for pallindrome: ");
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        int n = str.length();
        boolean flag=true;
        for (int i = 0; i < n/2; i++) {
            if (str.charAt(i)!=str.charAt(n-i-1)) {
                flag = false;
                break;
            }
        }
        if (flag==true) {
            System.out.println("String is Pallindrome");
        } else {
            System.out.println("String is not Pallindrome");
        }
        sc.close();
    }
}
