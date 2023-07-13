import java.util.Scanner;
import java.lang.StringBuilder;

public class StringCompression {
    public static String Compress(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count =1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count>1) {
                sb.append(count.toString());
            }

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println("Enter the String for Compression: ");
        Scanner sc = new Scanner(System.in);
        String stm = sc.next();
        String result = Compress(stm);
        System.out.println(result);
        sc.close();

    }
}
