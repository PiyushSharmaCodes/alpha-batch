import java.util.Scanner;

public class Counting {
    public static void CountingSort(int[] array) {
        int largest=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>largest) {
                largest=array[i];
            }
        }
       
    
        int count[]= new int[largest+1];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }
        int j=0;
        for (int i = 0; i < count.length; i++) {
            
            while (count[i]!=0) {
                array[j]=i;
                count[i]--;
                j++;
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
        CountingSort(array);
        System.out.println("Entered Array after sorting is");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        sc.close();
    }
}
