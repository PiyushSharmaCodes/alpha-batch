import java.util.Scanner;

public class ShortestPath {
    public static void main(String[] args) {
        System.out.println("Enter the Path :");
        Scanner sc = new Scanner(System.in);
        String path = sc.next();
        int x=0;
        int y=0;
        System.out.println("Enter initial coordinates: ");
        System.out.println("Enter X: ");
        x=sc.nextInt();
        System.out.println("Enter Y: ");
        y=sc.nextInt();
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i)=='E') {
                x++;
            }else if (path.charAt(i)=='W') {
                x--;
            }else if (path.charAt(i)=='N') {
                y++;
            }else if (path.charAt(i)=='S') {
                y--;
            }
        }
        double distance=Math.sqrt((Math.pow(x, 2)+Math.pow(y, 2)));
        System.out.println("Shortest Distance bw etween Initial and Final Position is :"+distance);
        sc.close();
    }

}
