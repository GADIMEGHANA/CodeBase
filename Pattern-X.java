import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || (i+j==n-1)){
                System.out.print("* ");
                }
                else{
                System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}