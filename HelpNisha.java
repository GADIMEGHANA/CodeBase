import java.util.*; 
public class HelpNisha {
    public static void main (String[] args) {
      Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt(); 
        
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int[] A = new int[N];
            
            int maxBalls = 0;
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
                if (A[i] > maxBalls) {
                    maxBalls = A[i];
                }
            }
            System.out.println(maxBalls);
        }
        
        scanner.close();

    }
}
