import java.util.*;

public class Desorting
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            int ans = Integer.MAX_VALUE;

            for (int i = 0; i < n - 1; i++) {
                long gap = a[i + 1] - a[i];

                if (gap < 0) {
                    ans = 0;
                    break;
                }

                int ops = (int)(gap / 2 + 1);
                ans = Math.min(ans, ops);
            }

            System.out.println(ans);
        }
    }
}