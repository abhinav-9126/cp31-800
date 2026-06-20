import java.util.*;

public class TargetPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int ans = 0;

            for (int i = 0; i < 10; i++) {
                String s = sc.next();

                for (int j = 0; j < 10; j++) {
                    if (s.charAt(j) == 'X') {
                        int ring = Math.min(
                                Math.min(i, 9 - i),
                                Math.min(j, 9 - j)
                        );

                        ans += ring + 1;
                    }
                }
            }

            System.out.println(ans);
        }
    }
}