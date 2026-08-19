import java.util.*;

public class LeetCode_20 {
    public static void main(String[] args) {

        String s = "{}[]()";
        Stack<Character> p = new Stack<>();
        boolean valid = true;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == '[' || c == '(' || c == '{') {
                p.push(c);
            }

            if(c == ']' || c == ')' || c == '}') {

                if(p.isEmpty()) {
                    valid = false;
                    break;
                }

                char top = p.peek();

                if((top == '[' && c == ']') ||
                   (top == '(' && c == ')') ||
                   (top == '{' && c == '}')) {

                    p.pop();

                } else {
                    valid = false;
                    break;
                }
            }
        }

        if(valid && p.isEmpty()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}