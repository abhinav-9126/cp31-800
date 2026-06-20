import java.util.*;

public class UnitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int sum = 0;
            int minus = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                sum += x;

                if (x == -1) {
                    minus++;
                }
            }

            int ans = 0;

            while (sum < 0 || minus % 2 != 0) {
                sum += 2;
                minus--;
                ans++;
            }

            System.out.println(ans);
        }
    }
}