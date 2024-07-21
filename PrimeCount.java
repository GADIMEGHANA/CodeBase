import java.util.*;
public class PrimeCount {
  
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int co=0;
        while(n>0){
            int c=n%10;
            n=n/10;
            if(isPrime(c)){
                co++;
            }
            
        }
        System.out.println(co);
    }
        public static Boolean isPrime(int c){
            for(int i=2;i<=Math.sqrt(c);i++){
                if(c%i==0){
                    return false;
                }
            }
            return true;
            
        }
    
}
