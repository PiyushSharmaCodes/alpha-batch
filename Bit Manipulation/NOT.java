import java.util.Scanner;

public class NOT {
    public static void main(String[] args) {
    System.out.println("Enter a Number: ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println("Result of NOT of "+num+" is "+(~num));
    sc.close();
}
}
