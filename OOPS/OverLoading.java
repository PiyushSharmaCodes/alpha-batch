public class OverLoading {
    public static void main(String[] args) {
        Calculation cal = new Calculation();
        System.out.println(cal.Add(2, 5));
        System.out.println(cal.Add(2, 5,8));
        System.out.println(cal.Add(2.8f, 5.77f));
    }
    
}