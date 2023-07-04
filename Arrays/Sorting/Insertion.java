import java.util.Scanner;

public class Insertion {
    public static void InsertionSort(int [] array) {
        int key;

for (int i = 1; i < array.length; i++)
{
    key=array[i];
   int j=i-1;
    while (j>=0&&array[j]>key)
    {
        array[j+1]=array[j];
        j--;
    }
    array[j+1]=key;
    
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
        InsertionSort(array);
        System.out.println("Entered Array after sorting is");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        sc.close();
    }
}