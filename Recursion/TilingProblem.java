import java.util.Scanner;

public class TilingProblem {
    public static int Tiling(int n) {
        if (n==0||n==1) {
            return 1;
        }
        //vertical
        int vertical= Tiling(n-1);
        //horizontal
        int horizontal=Tiling(n-2);
        return vertical+horizontal;
    }
    public static void main(String[] args) {
        System.out.print("Enter the length of floor: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = Tiling(n);
        System.out.println("Total ways to tile the floor is :"+result);
        sc.close();
    }
}
