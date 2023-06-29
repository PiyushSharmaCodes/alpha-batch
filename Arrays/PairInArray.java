import java.util.Scanner;

public class PairInArray {
    
        private static void PrintPair(int array[]) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                System.out.print("( "+array[i]+", "+array[j]+")  ");
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
    System.out.println("Pair in Given Array is : ");
    PrintPair(array);
    sc.close();
    }
    
}
