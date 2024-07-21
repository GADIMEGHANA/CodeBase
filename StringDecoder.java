import java.util.*;
public class StringDecoder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        sc.close();
        String a="";
        StringTokenizer t=new StringTokenizer(s,"0");
        while(t.hasMoreTokens()){
            String m=t.nextToken();
            int size=m.length();
            if(size==1) a+="A";
            if(size==2) a+="B";
            if(size==3) a+="C";
            if(size==4) a+="D";
            if(size==5) a+="E";
            if(size==6) a+="F";
            if(size==7) a+="G";
        }
        System.out.println(a);
    }
}

