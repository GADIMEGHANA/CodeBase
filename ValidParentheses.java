import java.util.Stack;
import java.util.Scanner;

class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')' && !st.isEmpty() && st.peek() == '(') {
                st.pop();
            } else if (ch == '}' && !st.isEmpty() && st.peek() == '{') {
                st.pop();
            } else if (ch == ']' && !st.isEmpty() && st.peek() == '[') {
                st.pop();
            } else {
                return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        ValidParentheses solution = new ValidParentheses();
        boolean result = solution.isValid(input);
        System.out.println( result);
    }
}
