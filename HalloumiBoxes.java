import java.util.*;
public class HalloumiBoxes
{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < n; i++){
                list.add(sc.nextInt());
            }
            ArrayList<Integer> list2 = new ArrayList<>(list);
            Collections.sort(list2);
            if(k>=2){
                System.out.println("YES");
            }else{
                if(list.equals(list2)){
                    System.out.println("YES");
                }else
                System.out.println("NO");
            }
        }
}
}