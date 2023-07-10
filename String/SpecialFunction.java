import java.util.Scanner;

public class SpecialFunction {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("YOur name is "+name +" and It have "+name.length()+" characters");

        // charAtr Method 
        System.out.println("First character of your name is :"+name.charAt(0));

        String lastname;
        System.out.println("Enter your lastname: ");
        lastname=sc.nextLine();
        name=name.concat(" "+lastname);
        System.out.println("your Full Name is : "+name);
        sc.close();
    }
}
