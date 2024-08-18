import java.util.*;
public class MagicalNumber {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int odd=0;
    for(int i=1;i<=n;i++){
        int sum=0;
        int y=i;
        ArrayList<Integer> a=new ArrayList<>();
        while(y>0){
            int m=y%2;
            a.add(m);
            y=y/10;
            }
            for(int j=0;j<a.size();j++){
                if(a.get(j)==0){
                    a.set(j,1);
                }
                else{
                    a.set(j,2);
                }
            }
            for(int j=0;j<a.size();j++){
                sum+=a.get(j);
            }
            if(sum%2!=0){
                odd++;
            }
    }
    sc.close();
    System.out.println(odd);
    }
}