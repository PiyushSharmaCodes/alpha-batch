import java.util.Scanner;

public class FriendsPair {
    public static int FriendsPairing(int n) {
        if (n==1||n==2) {
            return n ;
        }
        return FriendsPairing(n-1)+(n-1)*FriendsPairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println("Enter number of freinds in party");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = FriendsPairing(n);
        System.out.println("Total number of ways for pairing is :"+result);
        sc.close();
    }
}
