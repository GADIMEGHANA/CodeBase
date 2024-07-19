// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Count {
   
        int findCount(List<Integer> arr, int l, int num, int diff){
            if(!(arr.contains(num))){
                return -1;
            }
            int    co=0;
            for(int i=0;i<l;i++){
                if(Math.abs(num-arr.get(i))<=diff){
                    co++;
                }
            }
            return co;
        }
         public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
             int l=sc.nextInt();
             int num=sc.nextInt();
             int diff=sc.nextInt();
             ArrayList<Integer> arr=new ArrayList<>();
             for(int i=0;i<l;i++){
                 arr.add(sc.nextInt());
             }
             sc.close();
             Count c=new Count();
             System.out.println(c.findCount(arr,l,num,diff));
    }
}