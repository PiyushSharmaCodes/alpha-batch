import java.util.Scanner;

public class MinSubArray {
     private static int MinSub(int array[]) {
        int minsum=Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                 int sum=0;
                for (int k = i; k <= j; k++) {
                    sum+=array[k];
                    if (sum<minsum) {
                        minsum=sum;
                    }
                }
               
                
            }
           
        }
        return minsum;
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
        System.out.println("Min sum Present in given array is: "+MinSub(array));
        
        sc.close();
    }
}
