import java.util.Scanner;

public class MaxSubArray {
    private static int MaxSubBrute(int array[]) {
        int maxsum=Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                 int sum=0;
                for (int k = i; k <= j; k++) {
                    sum+=array[k];
                    if (sum>maxsum) {
                        maxsum=sum;
                    }
                }
               
                
            }
           
        }
        return maxsum;
    }
    private static int MaxSubOpt1(int array[]) {
        int maxsum=Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int sum=0;
            for (int j = i; j < array.length; j++) {
                 sum+=array[j];
                    if (sum>maxsum) {
                        maxsum=sum;
                    }
                
                
            }
           
        }
        return maxsum;
    }
    private static int MaxSubOpt2(int array[]) {
        int prefixsum[]= new int[array.length];
        int maxsum=Integer.MIN_VALUE;
        prefixsum[0]=array[0];
        for (int i = 1; i < prefixsum.length; i++) {
            prefixsum[i]=prefixsum[i-1]+array[i];
        }
        for (int i = 0; i < prefixsum.length; i++) {
            int currsum=0;
            for (int j = i; j < prefixsum.length; j++) {
                currsum =  i==0?prefixsum[j]:prefixsum[j]-prefixsum[i-1];
                if (currsum > maxsum) {
                maxsum=currsum;
                
            }
            }
            
        }
        return maxsum;
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
        System.out.println("Max sum Present in given array is: "+MaxSubBrute(array));
        System.out.println("Max sum Present in given array is: "+MaxSubOpt1(array));
        System.out.println("Max sum Present in given array is: "+MaxSubOpt2(array));
        
        sc.close();
    }
}
 