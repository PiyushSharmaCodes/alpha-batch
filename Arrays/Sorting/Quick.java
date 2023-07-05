import java.util.Scanner;

public class Quick{  
      
public static int Partition (int array[], int start, int end)  
{  
    int pivot = array[end]; 
    int i = (start - 1);  
  
    for (int j = start; j <= end - 1; j++)  
    {  
          
        if (array[j] < pivot)  
        {  
            i++;  
            int t = array[i];  
            array[i] = array[j];  
            array[j] = t;  
        }  
    }  
    int t = array[i+1];  
    array[i+1] = array[end];  
    array[end] = t;  
    return (i + 1);  
}  
  

public static void QuickSort(int array[], int start, int end) 
{  
    if (start < end)  
    {  
        int p = Partition(array, start, end); 
        QuickSort(array, start, p - 1);  
        QuickSort(array, p + 1, end);  
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
        QuickSort(array,0,n-1);
        System.out.println("Entered Array after sorting is");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
}
}  