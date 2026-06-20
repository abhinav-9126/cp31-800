import java.util.*;

public class DontTrytoCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();
            String tp = x;
            int r = -1;

            for (int i = 0; i <= 6; i++) {
                if (tp.contains(s)) {
                    r = i;
                    break;
                }
                tp = tp + tp;
            }
            System.out.println(r);
        }
    }
}