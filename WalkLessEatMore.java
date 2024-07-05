import java.util.*;

public class WalkLessEatMore {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> c=new ArrayList<>();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            c.add(a);
        }
        sc.close();
        long sum=0;
       Collections.sort(c);
       Collections.reverse(c);
       for(int j=0;j<n;j++){
            sum+=(Math.pow(2,j)*c.get(j));
          }
        System.out.println(sum);
    }
}