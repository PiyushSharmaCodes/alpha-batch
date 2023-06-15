import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows in the Character Pattern");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        char temp='A';
        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j <= i ;j++){
                System.out.print(temp+" ");
                temp++;
            }
            System.out.println();
        }

    }
}
