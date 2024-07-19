import java.util.*;
public class RatCountHouse {
  

   public static void main(String[] args) {
          System.out.println("Try programiz.pro");
          Scanner sc=new Scanner(System.in);
          int r=sc.nextInt();
          int n=sc.nextInt();
          int[] a=new int[n];
          for(int i=0;i<n;i++){
              a[i]=sc.nextInt();
          }
          sc.close();
          int l=0;
          int co=0;
          if(n==0){
              System.out.println(-1);
          }
          else{
          for(int i=0;i<n;i++){
            l+=a[i];
           co+=1;
           if(l>r*2){
               System.out.println(co);
                   break;
           }
           if(l<r*2){
              System.out.println(0);
          }
           }
          }
         
         
         
      }
  }
  
        
