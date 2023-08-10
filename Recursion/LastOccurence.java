import java.util.Scanner;
public class LastOccurence {
     public static int EndOccurence(int[] arr,int i,int t) {
        if (i==arr.length) {
            return -1;
        }
         int result=EndOccurence(arr,i+1,t);
        if (result==-1 && arr[i]==t) {
            return i;
        }
        return result;
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
        int result=EndOccurence(array,0,target);
        if (result==-1) {
            System.out.println("Element is not present in array");
        }else{
            System.out.println("Element Last occured at "+result+" index");
        }
        
        sc.close();
    }
}

