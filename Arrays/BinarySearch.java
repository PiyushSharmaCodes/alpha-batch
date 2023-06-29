import java.util.Scanner;

public class BinarySearch {
    private static int SearchBinary(int array[],int key,int start,int end) {
        
        while (start<=end) {
           int mid=(start+end)/2;
           if (array[mid]==key) {
            return mid+1;
           } if (array[mid]<key) {
            start=mid+1;
           } else {
            end=mid-1;
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n =sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter Element in the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i]= sc.nextInt();
        }
        System.out.println("Enter the value to search in array");
        int key = sc.nextInt();
        int position = SearchBinary(array, key, 0, n-1);
        if (position==-1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element Found at position "+position +" in the array");
        }
        sc.close();
    }
}
