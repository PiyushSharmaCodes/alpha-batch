import java.util.Scanner;

public class Bank {
public static void main(String[] args) {
    BankAccount A1= new BankAccount();
    System.out.println("Enter Username: ");
    Scanner sc = new Scanner(System.in);
    A1.username=sc.next();
    System.out.println("Enter Password: ");
    A1.setPassword(sc.next());
    System.out.println("Paasword of "+A1.username+" is "+A1.getPassword());
    sc.close();
    
}
    
}
