import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()";

        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()) {
            if(c == '(' || c == ')') {
                if(c == ')' && stack.peek().equals('(')) {
                    stack.pop();
                } else {
                    stack.push(c);
                }

            } else if (c == '[' || c == ']') {
                if(c == ']' && stack.peek().equals('[')) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else if (c == '{' || c == '}') {
                if(c == '}' && stack.peek().equals('{')) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }

        System.out.println(stack.size() == 0 ? true : false);
    }
}
