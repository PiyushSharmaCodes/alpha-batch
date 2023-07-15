import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("Enter the input string: ");
        Scanner sc = new Scanner(System.in);
        String stm = sc.nextLine();
        int count=0;
        for (int i = 0; i < stm.length(); i++) {
            char ch=stm.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                count++;
            }
        }
        System.out.println("Number of vowels present in the statement is : "+count);
        sc.close();
    }
}
