import java.util.*;
public class OperationBinaryString {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        sc.close();
        char[] ch=s.toCharArray();
        if(s.length()==0){
            System.out.println(-1);
        }
        else{
            char c=0;
            for(int i=0;i<ch.length-2;i=i+2){
                c=ch[i];
                if(ch[i+1]=='A'){
                    c=(c=='1' && ch[i+2]=='1')? '1':'0';
                    ch[i+2]=c;
                   
                }
                if(ch[i+1]=='B'){
                    c=(c=='0' && ch[i+2]=='0')?'0':'1';
                    ch[i+2]=c;
                }
                if(ch[i+1]=='C'){
                    c=((c=='1' && ch[i+2]=='1') || (c=='0' && ch[i+2]=='0'))?'0':'1';
                    ch[i+2]=c;
                }
            }
            System.out.println(c);
        }
    }
}
