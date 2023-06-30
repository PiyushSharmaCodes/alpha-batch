import java.util.Scanner;
public class TrappingRainWater {
    private static int RainWater(int[] array) {
        int n = array.length;
        int [] prefixMax = new int[n];
        int [] suffixMax = new int[n];
        int trapwater=0;
        prefixMax[0]=array[0];
        suffixMax[n-1]=array[n-1];
        for (int i = 1; i < prefixMax.length; i++) {
            prefixMax[i]=Math.max(prefixMax[i-1],array[i]);
        }
        for (int i = n-2; i >= 0; i--) {
            suffixMax[i]=Math.max(suffixMax[i+1],array[i]);
        }
        
        for (int i = 0; i < n; i++) {
            trapwater+=Math.min(prefixMax[i], suffixMax[i])-array[i];
        }
        return trapwater;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements in array: ");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Enter values in the Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
        }
        int result=RainWater(array);
        System.out.println("Total amount of trapped water is : "+result);
        sc.close();
    }
}
