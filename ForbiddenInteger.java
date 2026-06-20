import java.util.*;

public class ForbiddenInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();

            ArrayList<Integer> ans = new ArrayList<>();

            if (x != 1) {
                for (int i = 0; i < n; i++) {
                    ans.add(1);
                }
            } else {
                if (k == 1) {
                    System.out.println("NO");
                    continue;
                }

                if (n % 2 == 0) {
                    for (int i = 0; i < n / 2; i++) {
                        ans.add(2);
                    }
                } else {
                    if (k < 3) {
                        System.out.println("NO");
                        continue;
                    }

                    ans.add(3);
                    for (int i = 0; i < (n - 3) / 2; i++) {
                        ans.add(2);
                    }
                }
            }

            System.out.println("YES");
            System.out.println(ans.size());

            for (int val : ans) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}