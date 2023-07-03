import java.util.Scanner;

public class DuplicateElementcheck {
    public static boolean checkDuplicate(int array[]){
        boolean result=false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]==array[j]) {
                    return true;
                }
            }
        }
        return result;
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
        boolean result=checkDuplicate(array);
        System.out.println("Result for Duplicacy in array is : "+result);
        sc.close();
    }
}
