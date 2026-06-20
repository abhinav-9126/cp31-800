import java.util.*;

public class MakeItBeautiful{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // The array is already sorted according to the question
            if (a[0] == a[n - 1]) {
                System.out.println("NO");
            } else {
                System.out.println("YES");

                // Print one maximum element first
                System.out.print(a[n - 1] + " ");

                // Print all remaining elements
                for (int i = 0; i < n - 1; i++) {
                    System.out.print(a[i] + " ");
                }

                System.out.println();
            }
        }
    }
}
