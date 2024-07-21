import java.util.Scanner;
public class EmailCheck {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String v = "invalid";  // default value
        
        if (s.equals(s.toLowerCase())) {  // checks if the entire string is lowercase
            if (s.contains(".com") && (s.contains("@gmail") || s.contains("@wipro") || s.contains("@yahoo"))) {
                boolean hasDigit = false;
                boolean hasAlphabet = false;
                for (char c : s.toCharArray()) {
                    if (Character.isDigit(c)) {
                        hasDigit = true;
                    }
                    if (Character.isAlphabetic(c)) {
                        hasAlphabet = true;
                    }
                }
                if (hasDigit && hasAlphabet) {
                    v = "valid";
                }
            }
        }

        System.out.println(v);
        sc.close();
    }
}
