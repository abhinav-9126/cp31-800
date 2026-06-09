
import java.util.*;

public class LineTrip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            int c = list.get(0);
            for (int i = 1; i < n; i++) {
                c = Math.max(c, list.get(i) - list.get(i - 1));
            }
            c = Math.max(c, (2 * Math.abs(list.get(n - 1) - k)));
            System.out.println(c);
        }
    }
}
