import java.util.Scanner;

public class LargestInArray {
   
    public static int LargestSearch(int array[]) {
    int Largest=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>Largest) {
                Largest=array[i];
            }
        }
        return Largest;
    } 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of Array :");
    int n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter values in the Array: ");
    for (int i = 0; i < a.length; i++) {
        a[i]=sc.nextInt();

    }

    int Value=LargestSearch(a);
    
    System.out.println("Largest element in array is "+Value);
        
    
    sc.close();
}
}
