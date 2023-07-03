import java.util.Scanner;

public class Selection {
    public static void SelectionSort(int [] array) {
        int min_idx=0;
        for (int i = 0; i < array.length-1; i++) {
            min_idx=i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j]<array[min_idx]) {
                    min_idx=j;
                }
            }
            if (min_idx!=i) {
                int temp=array[i];
                array[i]=array[min_idx];
                array[min_idx]=temp;
            }
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
        System.out.println("Entered Array before sorting is");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        SelectionSort(array);
        System.out.println("Entered Array after sorting is");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        sc.close();
    }
}
