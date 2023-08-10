import java.util.Scanner;

/**
 * CheckSorted
 */

public class CheckSorted {
    public static boolean isSorted(int[] arr,int i) {
        if (i==arr.length-1) {
            return true;
        }
        if (arr[i]>arr[i+1]) {
            return false;
        }
        return isSorted(arr,i+1);
    }
    public static void main(String[] args) {
        System.out.println("Enter Number of Element in the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter Element of array: ");
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
        }
        if (isSorted(array,0)) {
            System.out.println("given array is sorted");
        }else{
            System.out.println("Given array is not sorted");
        }
        sc.close();
    }
    
}