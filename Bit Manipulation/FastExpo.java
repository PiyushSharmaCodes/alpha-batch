import java.util.Scanner;

public class FastExpo {
    public static int ExponentCalculation(int num,int pow){
    int ans=1;
    while(pow!=0){
        if ((pow&1)==1) {
            ans=num*ans;
            num=num*num;
        } else {
            ans=ans*1;
            num=num*num;
        }
        pow=pow>>1;
    }
    return ans;
}
    public static void main(String[] args) {
        System.out.println("Enter the number and the power of calculation: ");
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Enter the power: ");
        int pow= sc.nextInt();
        int result=ExponentCalculation( num, pow);
        System.out.println("The result for your entered details is :"+ result);
    }

}
