import java.util.Scanner;

public  class CheckPrime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to check for Prime");
        int n= sc.nextInt();
        boolean isprime=true;
        if(n==2){
            System.out.println("The given number "+ n +" is prime");
        }else{
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n%i==0){
                isprime=false;
                break;
            }
        }
        if(isprime==true){
            System.out.println("The given number "+ n +" is prime");
        }
        else{
            System.out.println("The given number "+ n +" is not prime");
        }
    }
        
    }
}