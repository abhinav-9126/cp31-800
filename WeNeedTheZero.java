import java.util.*;

public class WeNeedTheZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int xor = 0;

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                xor ^= a;
            }

            if (n % 2 == 1) {
                System.out.println(xor);
            } else {
                if (xor == 0) {
                    System.out.println(0);
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
 }

    
