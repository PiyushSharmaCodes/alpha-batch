import java.util.Scanner;

public class Bubble {
    public static void BubbleSort(int array[]) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 1; j < n-i; j++) {
                if (array[j-1]>array[j]) {
                    int temp =array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
            System.out.println("Pass: "+(i+1));
                for (int k = 0; k < array.length; k++) {
                System.out.print(array[k]+" ");
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
        System.out.println("Entered Array before sorting is");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        BubbleSort(array);
        System.out.println("Entered Array after sorting is");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        sc.close();

    }
}
    
    
