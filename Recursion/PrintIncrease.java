// package Recursion;

import java.util.Scanner;

public class PrintIncrease {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintInc(n);
        sc.close();

    }
    public static void PrintInc(int n) {
        if (n==0) {
            return;
        }
         PrintInc(n-1);
        System.out.print(n+" ");
    }
}
