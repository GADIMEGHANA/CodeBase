
import java.util.*;

public class TheEndGame {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int p=0;
        int g=0;
        int n=sc.nextInt();
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            li.add(a);
        }
        sc.close();
        boolean pp=true;
        int i=0;
        int j=li.size()-1;
        for(int k=0;k<n;k++){
           
                if(li.get(i)>=li.get(j)){
                    if(pp){
                        p+=li.get(i);
                       
                    }
                    else{
                        g+=li.get(i);
                       
                    }
                     i++;
                }
                else{
                    if(pp){
                        p+=li.get(j);
                       
                    }
                    else{
                        g+=li.get(j);
                       
                    }
                    j--;
                }
            pp=!pp;
            }
       
        if(p>=g){
            System.out.println("Pucca");
        }
        else{
             System.out.println("Garu");
        }
       
    }
}