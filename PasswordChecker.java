// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class PasswordChecker {
            
        public int checkPassword (String str){
            if(str.contains(" ") || str.contains("/")){
                return 0;
            }
            if(Character.isDigit(str.charAt(0))){
                return 0;
            }
            if(str.length()<4){
                    return 0;
                }
             int c=0;
             int n=0;
            for(int i=0;i<str.length();i++){
                
                if(str.charAt(i)<=0 && str.charAt(i)>=9){
                    n++;
                } 
                if(Character.isUpperCase(str.charAt(i))){
                    c++;
                }
                
            }
            if(n>0 && c>0){
                return 1;
            }
            else{
                return 0;
            }
        }
         public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
            sc.close();
             PasswordChecker h=new PasswordChecker();
             String str=sc.nextLine();
             System.out.println(h.checkPassword(str));
        
    }
}