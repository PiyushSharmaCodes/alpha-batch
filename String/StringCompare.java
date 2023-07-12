import java.util.Scanner;

public class StringCompare {
    public static String SubString(String s,int start , int  end) {
        String substring="";
        for (int i = start; i < end; i++) {
            substring+=s.charAt(i);
        }
        return substring;
    }
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
        System.out.println("Enter start for substring");
        int s = sc.nextInt();
        System.out.println("Enter end for substring");
        int e = sc.nextInt();
        // System.out.println(SubString(str3, s, e));
        // alternative to this function code is inbuit java method for substring
        System.out.println(str3.substring(s, e));

        sc.close();
    }
}
