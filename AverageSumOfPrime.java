import java.util.*;
class Main
{
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c=0;
        int sum=0;
        int q=0;
        if(n<1 || m<1){
          System.out.println("Invalid Inputs");
        }
        else{
          
          for(int i=n+1;i<m;i++){
            for(int j=2;j<=i/2;j++){
              if(i%j==0){
                c=0;
                break;
              }
              else{
                c=1;
          
              }
            }
            if(c==1 && i!=1 || i==2 || i==3){
              q++;
              sum+=i;
            }
          } 
          
          Double d=(double)sum/q;
          String s=String.format("%.3f",d);
          System.out.println(s);
        
        }
        sc.close();
    }
}
