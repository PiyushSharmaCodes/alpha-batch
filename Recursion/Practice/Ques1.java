// For a given integer array of size N. You have to find all the occurrences (indices) of a given element (Key)and print them.Use a recursive function to solve this problem.Sample 
// Input: arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2},
// key = 2 Sample 
// Output: 1 5 7 8

import java.util.Scanner;
public class Ques1 {
    public static void FindAllOccurence(int arr[],int idx,int key) {
    if(idx==arr.length){
        return;
    }
    if (arr[idx]==key) {
            System.out.print(idx+" ");
        }
    FindAllOccurence(arr,idx+1,key);

}
    public static void main(String[] args) {
        System.out.println("Enter number of elements in array :");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println("Enter the array's elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of key: ");
        int key = sc.nextInt();
        FindAllOccurence(arr,0,key);
        sc.close();
    }
}
