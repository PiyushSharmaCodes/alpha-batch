import java.util.Scanner;

public class LinearSearch {
    public static int SearchLinear(int array[],int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]==key) {
                return i+1;
            }
        }
        return -1;
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
    System.out.println("Enter the value of key for search :");
    int key=sc.nextInt();
    int position=SearchLinear(a,key);
    if (position==-1) {
        System.out.println("Element not found ");
    } else {
        System.out.println("Element found at Position "+position+" in the array");
        
    }
    sc.close();
}
    
}