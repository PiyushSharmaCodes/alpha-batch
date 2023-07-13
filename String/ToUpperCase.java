import java.util.Scanner;
import java.lang.StringBuilder;

public class ToUpperCase {
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i)==' '&& i< str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                ch = Character.toUpperCase(str.charAt(i));
                sb.append(ch);
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the statement to change it in uppercase: ");
        String stm = sc.nextLine();
        String result = toUpperCase(stm);
        System.out.println(result);
        sc.close();
    }
}
