// package Practice;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Complex a = new Complex();
        System.out.println("Enter the real and Imaginary parts of two complex number: ");
        System.out.println("Enter First: ");
        a.real=sc.nextInt();
        a.imaginary=sc.nextInt();
        Complex b = new Complex();
        System.out.println("Enter Second: ");
        b.real=sc.nextInt();
        b.imaginary=sc.nextInt();
        Complex c = Complex.Add(a,b);
        Complex.Display(c);
        sc.close();


    }
}
