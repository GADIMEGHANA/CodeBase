import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            l.add(m);
        }
        int j=1;
        while(j<=3){
        int d=Collections.max(l);
        a*=d;
       l.remove(Integer.valueOf(d));
       j++;
        }
        System.out.println(a);
    }
}
