import java.util.Scanner;

public class PrintSubarray {
    private static void PrintSub(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                 
                for (int k = i; k <= j; k++) {
                    System.out.print(array[k]+" ");
                }
                System.out.println();
                
            }
            System.out.println();
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
        System.out.println("All the SubArray Present inn given array is: ");
        PrintSub(array);
        sc.close();
    }
}
