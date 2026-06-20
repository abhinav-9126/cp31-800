import java.util.*;

public class DoremysPaint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            HashSet<Integer> set = new HashSet<>();

            for (int i = 0; i < n; i++) {
                set.add(sc.nextInt());
            }

            if (set.size() <= 2) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}