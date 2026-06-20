import java.util.*;

public class ExtremelyRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;

            for (int power = 1; power <= 100000; power *= 10) {
                for (int digit = 1; digit <= 9; digit++) {
                    int num = digit * power;

                    if (num <= n) {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }
}