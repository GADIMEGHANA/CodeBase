
  import java.util.*;

  public class SumofPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        Set<Integer> al = new HashSet<>();
        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }
        sc.close();
        for (int num : l) {
            if (isPrime(num)) {
                al.add(num);
            }
        }
        int sum = 0;
        for (int prime : al) {
            sum += prime;
        }

        int min =  Collections.min(al);
        System.out.println(sum - min);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
                return false; 
            }
        }
        return true; 
        }
}
