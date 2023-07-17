import java.util.Scanner;

public class RightShift {
public static void main(String[] args) {
    System.out.println("Enter a Number: ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println("How many bits you have to shift left: ");
    int no_bit=sc.nextInt();
    System.out.println("Result of "+num+"shifted "+ no_bit +" bits right is "+(num>>no_bit));
    sc.close();
}
    
}
