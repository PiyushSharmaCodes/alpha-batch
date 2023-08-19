import java.util.Scanner;

public class BinaryString {
    public static void PrintAllBinaryString(int n,int lastvalue,String str) {
        if (n==0) {
            System.out.println(str);
            return;
        }
        PrintAllBinaryString(n-1,0,str+"0");
        if (lastvalue!=1) {
            PrintAllBinaryString(n-1,1,str+"1");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the size n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintAllBinaryString(n,0,"");
        sc.close();
    }
}
