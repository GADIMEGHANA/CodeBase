import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
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
    }
}