import java.util.*;
public class HowMuchDoesDaytonaCost
{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                list.add(sc.nextInt());
            }
            if(list.contains(k)) System.out.println("YES");
            else System.out.println("NO");
        }
 }
}
