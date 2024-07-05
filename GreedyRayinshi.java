import java.util.*;

public class GreedyRayinshi{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            l.add(a);
        }
        sc.close();
        int r=0;
        int k=0;
        
        for(int j=1;j<=n;j++){
            int s=l.get(0);
            int m=l.get(l.size()-1);
        
        int c=s>m?s:m;
            if(j%2!=0){
                r+=c;
                l.remove(Integer.valueOf(c));
                
            }
            if(j%2==0){
                k+=c;
                l.remove(Integer.valueOf(c));
            }
           
            
        }
        System.out.println(r+" "+k);

    }
}
