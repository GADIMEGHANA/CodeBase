import java.util.*;
public class PlaceTheAlpha {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading input
        int n = sc.nextInt();
        int[] inputArray = new int[n];
        
        for (int i = 0; i < n; i++) {
            inputArray[i] = sc.nextInt();
        }
        sc.close();
        int[] sortedArray = inputArray.clone();
        Arrays.sort(sortedArray);
        Map<Integer, Character> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(sortedArray[i], (char) ('a' + i));
        }
        char[] resultArray = new char[n];
        for (int i = 0; i < n; i++) {
            resultArray[i] = map.get(inputArray[i]);
        }
        System.out.println(Arrays.toString(resultArray));
    }
}
