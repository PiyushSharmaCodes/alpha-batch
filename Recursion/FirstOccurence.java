import java.util.Scanner;

public class FirstOccurence {
     public static int FindOccurence(int[] arr,int i,int t) {
        if (i==arr.length) {
            return -1;
        }
        if (arr[i]==t) {
            return i;
        }
        return FindOccurence(arr,i+1,t);
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
        System.out.print("Enter target value: ");
        int target=sc.nextInt();
        int result=FindOccurence(array,0,target);
        if (result==-1) {
            System.out.println("Element is not present in array");
        }else{
            System.out.println("Element first occured at "+result+" index");
        }
        
        sc.close();
    }
}
