// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern2(n);
        pattern1(n);
        patternnum(n);
        sc.close();
        
    }
        public static void pattern1(int n){
            for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n ");
        
        }
        public static void pattern2(int n){
           
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n ");
    }
        
    public static int patternnum(int n){
        if (n < 1) {
            System.out.println("Invalid Input");
        } else {
            for (int i = n; i >0 ; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print((i*2)+" ");
                }
                // Print 1s       }
                System.out.println();
            }
        }
        return 0;
    }
}