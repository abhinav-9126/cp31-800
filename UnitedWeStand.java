import java.util.*;
public class UnitedWeStand
{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            ArrayList<Integer> ans = new ArrayList<>();

            ans.add(b[0]);

            for (int i = 1; i < n; i++) {
                if (b[i - 1] > b[i]) {
                    ans.add(1);
                }
                ans.add(b[i]);
            }

            System.out.println(ans.size());

            for (int x : ans) {
                System.out.print(x + " ");
            }

            System.out.println();
        }
    }
}