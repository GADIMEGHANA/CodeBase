import java.util.*;
public class LargestBinary {
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        StringBuilder s=new StringBuilder();
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
                if(a[i][j]==1){
                    s.insert(0,'1');
                }
                else{
                    s.append('0');
                }
                
            }
        }
        sc.close();
        s.reverse();
        int sum=0;
        String sb=s.toString();
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='1'){
            sum+=Math.pow(2,i);
            }
        }
        System.out.println(sum);
    }
}