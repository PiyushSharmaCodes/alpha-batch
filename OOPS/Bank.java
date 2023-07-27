import java.util.Scanner;

public class Bank {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
        // BankAccount A1= new BankAccount();
    System.out.println("Enter Username: ");
    String username=sc.next();
    System.out.println("Enter Password: ");
    String password = sc.next();
    BankAccount A1 = new BankAccount(username, password);
    System.out.println("Paasword of "+A1.username+" is "+A1.getPassword());
    System.out.println("Do you want to exit from the Account Creation: press 0");
    int response=sc.nextInt();
    
    if (response==0) {
        break;
    }else{
        continue;
    }

    }
    sc.close();
    
}
    
}
