// package Practice;

public class Complex {
    int real;
    int imaginary;
    public static Complex Add(Complex a, Complex b) {
        Complex c = new Complex();
        c.real=a.real+b.real;
        c.imaginary=a.imaginary+b.imaginary;
        return c ;
    }
    public static void Display(Complex x) {
        System.out.println(x.real+" + "+x.imaginary+"i");
    }
}
