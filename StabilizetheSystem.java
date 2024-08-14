import java.util.*;
public class StabilizetheSystem {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
        String s=String.valueOf(n);
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            char ch=s.charAt(i);
            if(ch!='0'){
                continue;
            }
            else{
                sb.replace(i,i+1,"5");
            }
        }
        int m=Integer.parseInt(sb.toString());
        System.out.println(m);
        sc.close();
    }
}