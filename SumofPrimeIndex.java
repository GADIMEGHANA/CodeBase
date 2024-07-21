import java.util.*;
class SumofPrimeIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        Set<Integer> s=new HashSet<>();
        int sum=0;
        for(int i=2;i<n;i++){
            if(isPrime(i)){
               s.add(l.get(i)); 
            }
        }
         for(int um : s){
            sum+=um;
        }
        System.out.println(sum);
        sc.close();
    }
        public static Boolean isPrime(int i){
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    return false;
                }
            }
            return true;
        }
        
        
    
}