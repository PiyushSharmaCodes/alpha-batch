import java.util.Scanner;

public class LargestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of string in the String array");
        int n = sc.nextInt();
        String[] strArray = new String[n];
        System.out.println("Enter String in the array: ");
        for (int i = 0; i < strArray.length; i++) {
            strArray[i]=sc.next();
        }
        String largest1=strArray[0];
        for (int i = 1; i < strArray.length; i++) {
            if (largest1.compareTo(strArray[i]) < 0) {
                largest1=strArray[i];
            }
        }
        String largest2=strArray[0];
        for (int i = 1; i < strArray.length; i++) {
            if (largest2.compareToIgnoreCase(strArray[i]) < 0) {
                largest2=strArray[i];
            }
        }
        System.out.println("Lexicographic Largest string from the array is :"+largest1);
        System.out.println("Lexicographic Largest string ignoring upper and lower case is from the array is :"+largest2);
        sc.close();
    }
}
