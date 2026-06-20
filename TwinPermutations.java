import java.util.*;

public class TwinPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[][] arr = new int[n][2];

            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = i;
            }

            Arrays.sort(arr, (x, y) -> y[0] - x[0]);

            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                int originalIndex = arr[i][1];
                b[originalIndex] = i + 1;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(b[i] + " ");
            }

            System.out.println();
        }
    }
}