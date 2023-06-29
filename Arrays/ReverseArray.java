import java.util.Scanner;

public class ReverseArray {
    
    private static void ArrayReverse(int array[]) {
        int n = array.length;
        for (int i = 0; i < array.length/2; i++) {
            int t =array[i];
            array[i]=array[n-i-1];
            array[n-i-1]=t;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Element in the Array");
        int n = sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter Values in the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println("Array Before reversal is : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        ArrayReverse(array);
        System.out.println();
        System.out.println("Array After reversal is : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        sc.close();
    }
}
