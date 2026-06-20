    import java.util.*;

public class WalkingMaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();

            if (d < b) {
                System.out.println(-1);
                continue;
            }

            long up = d - b;
            long xAfterUp = a + up;

            if (c > xAfterUp) {
                System.out.println(-1);
            } else {
                long leftMoves = xAfterUp - c;
                System.out.println(up + leftMoves);
            }
        }
    }
}