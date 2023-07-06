import java.util.Arrays;
import java.util.Scanner;

public class InbuiltSort {
    public static void Increasing(int array[]) {
        int  n = array.length;
        Arrays.sort(array, 0, n);
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
        System.out.println("Entered Array before sorting is");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        Increasing(array);
        System.out.println("Entered Array after sorting in increasing order is :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        
        sc.close();
    }
}
