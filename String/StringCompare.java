import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 ="hello";
        String str2 ="hello";
        System.out.println("Enter third string: ");

        String str3=new String(sc.next());
        if (str1==str2) {
            System.out.println("String 1 and 2 are equal: using == operator");
        }else{
            System.out.println("String 1 and 2 are not equal: using == operator");
        }
        if (str1==str3) {
            System.out.println("String 1 and 3 are equal: using == operator");
        }else{
            System.out.println("String 1 and 3 are not equal: using == operator");
        }
        if (str1.equals(str3)) {
            System.out.println("String 1 and 3 are equal: using .equals() method");
        }else{
            System.out.println("String 1 and 3 are not equal: using .equals() method");
        }
        sc.close();
    }
}
