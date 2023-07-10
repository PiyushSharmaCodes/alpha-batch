import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        //Character Array
        char[] list = {'P','i','y','u','s','h',' '};
        String firstname= "Piyush";
        String lastname = new String("Sharma");
        System.out.println(firstname);
        System.out.println(lastname);
        // String are immutable
        // lastname[0]='r';
        // System.out.println(lastname[0]);
        System.out.println("After Mutation of Character array: ");
        System.out.println(list);
        list[1]='r';
        list[2]='i';
        list[3]='y';
        list[4]='a';
        list[5]='n';
        list[6]='k';
        System.out.println("After Mutation of Character array: ");
        System.out.println(list);

        //Input and Output
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a your name :");
        name=sc.next();
        sc.nextLine();//This is added to clear the buffer because it is not taking the next input
        System.out.println("Your Entered name is :"+ name);
        System.out.println("What is your Hobby?");
        String hobby=sc.nextLine();
        System.out.println("Your Hobby is :"+hobby);

    }
    
}