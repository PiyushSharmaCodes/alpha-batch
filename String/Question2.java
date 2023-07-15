import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
    public static boolean AreAnagram1(String str1,String str2) {
        //Using the character arrays and sort them to compare individual character
        char[] charArray1=str1.toCharArray();
        char[] charArray2=str2.toCharArray();
        Arrays.sort(charArray1, 0,str1.length()-1);
        Arrays.sort(charArray2, 0,str1.length()-1);
        if (charArray1.length!=charArray2.length) {
            return false;
        }else{
            for (int i = 0; i < charArray1.length; i++) {
                if (charArray1[i]!=charArray2[i]) {
                    return false;
                }
            }
        }
        
        return true;
    }
    public static boolean AreAnagram2(String str1,String str2) {
        //Using a character array of length 256 to store the count of every character in the first string and elementing it when we encounter the same charater in the second string 
        // then all the element of count array is zero for anagram strings
        int countarray[]=new int[256];
        for (int i = 0; i < str1.length(); i++) {
            countarray[str1.charAt(i)]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            countarray[str1.charAt(i)]--;
        }
        for (int i = 0; i < countarray.length; i++) {
            if (countarray[i]!=0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter both strings to check for anagram: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1=sc.next();
        System.out.println("Enter the first string");
        String str2=sc.next();
        boolean result=AreAnagram2(str1, str2);
        if (result==true) {
        System.out.println("Both Strings are Anagrams of each other");
        }else{
            System.out.println("Strings are not anagrams");
        }
        sc.close();
    }
}
