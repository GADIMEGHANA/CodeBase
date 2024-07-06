
import java.util.*;

public class FindTheRightFit {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       ArrayList<Integer> m=new ArrayList<>();
        ArrayList<Integer> h=new ArrayList<>();
        for(int i=0;i<n;i++){
           int a=sc.nextInt();
            m.add(a);
        }
        for(int i=0;i<n;i++){
            int b=sc.nextInt();
            h.add(b);
        }
        sc.close();
        Collections.sort(m);
        Collections.sort(h);
        int max=0;
        for(int i=0;i<n;i++){
            int c=Math.abs(m.get(i)-h.get(i));
            if(c>max){
                max=c;
            }
        }
        System.out.println(max);
    }
}