import java.util.*;
class Main
{
    public static void main(String args[])
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        int c=0;
        if(n<1 || m<1){
          System.out.println("Invalid Inputs");
        }
        else{
          for(int i=n;i<=m;i++){
            for(int j=2;j<=i/2;j++){
            if(i%j==0){
              c=0;
              break;
            }
            else{
              c=1;
            }
          }
          if(c==1 ||  i==2|| i==3){
            a.add(i);
          }
          
        }
        
        for(int i=0;i<a.size()-1;i++){
          System.out.print(a.get(i)+", ");
        }
        System.out.print(a.get(a.size()-1));
        }
    }
}
