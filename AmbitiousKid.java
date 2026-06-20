import java.util.*;
public class AmbitiousKid
{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        
        int n = sc.nextInt();
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            ans = Math.min(ans, Math.abs(x));
        }

        System.out.println(ans);
    }
}