import java.util.*;

public class OneAndTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            int totalTwo = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 2) {
                    totalTwo++;
                }
            }

            if (totalTwo % 2 == 1) {
                System.out.println(-1);
            } else {
                int half = totalTwo / 2;

                if (half == 0) {
                    System.out.println(1);
                } else {
                    int countTwo = 0;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] == 2) {
                            countTwo++;
                        }

                        if (countTwo == half) {
                            System.out.println(i + 1);
                            break;
                        }
                    }
                }
            }
        }
    }
}