
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

    }
    
}