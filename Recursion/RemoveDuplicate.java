import java.util.Scanner;

/**
 * RemoveDuplicate
 */
public class RemoveDuplicate {
    public static void removeDuplicate(String str, int idx , StringBuilder newStr,boolean map[]) {
        if (idx==str.length()-1) {
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        if (map[currChar-'a']==true) {
            removeDuplicate(str, idx+1, newStr, map);
        }
        else{
            map[currChar-'a']=true;
            removeDuplicate(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String orgnlString = sc.nextLine();
        StringBuilder sb = new StringBuilder("");
        int idx = 0;
        boolean[] map = new boolean[26];
        removeDuplicate(orgnlString, idx, sb, map);
        sc.close();
    }
    
}