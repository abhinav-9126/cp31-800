
import java.util.*;

public class CoverinWater {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int d = 0, c = 0;
            boolean b = false;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '.') {
                    d++;
                    c++;

                    if (c >= 3) {
                        b = true;
                    }
                } else {
                    c = 0;
                }
            }
            if (b) {
                System.out.println(2); 
            }else {
                System.out.println(d);
            }
        }
    }
}
