import java.util.Scanner;

public class SpecialFunction {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("YOur name is "+name +" and It have "+name.length()+" characters");
        sc.close();
    }
}
