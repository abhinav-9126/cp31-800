import java.util.*;

public class EverybodyLikesGoodArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int operations = 0;

            for (int i = 0; i < n - 1; i++) {
                if (a[i] % 2 == a[i + 1] % 2) {
                    operations++;
                }
            }

            System.out.println(operations);
        }
    }
}