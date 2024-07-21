import java.util.*;
public class PositiveRepeat {


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
        int count =0;
        for(int i=0;i<n;i++){
            int q=ar.get(i);
            if(q<=0){
                continue;
            }
            if(m.containsKey(ar.get(i))){
                co=ar.get(i);
                break;
            }
            else{
                m.put(ar.get(i),1);
                count++;
                if(count==m.size()){
                count=ar.get(i);
                System.out.println(count);
        }
            }
        }
        
        
        if(count<m.size()){
            System.out.println(co);
        }
    
    }
}
