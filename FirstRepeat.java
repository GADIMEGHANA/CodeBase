import java.util.*;
public class FirstRepeat {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> ar=new ArrayList<>();
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            ar.add(sc.nextInt());
        }
        sc.close();
        Collections.reverse(ar);
        int co=0;
        for(int i=0;i<n;i++){
            if(m.containsKey(ar.get(i))){
                co=ar.get(i);
                break;
            }
            else{
                m.put(ar.get(i),1);
            }
        }
        System.out.println(co);
    
    }
}