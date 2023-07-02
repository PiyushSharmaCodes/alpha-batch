import java.util.Scanner;

public class MaxProfit {
    public static int ProfitMax(int array[]){
        
        int buyPrice=Integer.MAX_VALUE;
        int MaxProfit=0;
        for (int i = 0; i < array.length; i++) {
             if (buyPrice<array[i]) {
            int profit=array[i]-buyPrice;
        MaxProfit=Math.max(MaxProfit, profit);
        }else{
            buyPrice=array[i];
        }
        
        }
        return MaxProfit;
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
        int MaxProfit=ProfitMax(array);
        System.out.println("MaxProfit can be : "+MaxProfit);
        sc.close();
    }
}
