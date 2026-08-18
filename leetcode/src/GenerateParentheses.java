import java.util.List;
import java.util.Stack;

public class GenerateParentheses {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    public static List<String> generateParenthesis(int n) {
        return null;
    }

    private static void dfs_bt(int n, Stack<String> path) {
        if((path.size() % n) == 0) {
            return;
        }

        for(String parentheses: List.of("(", ")")) {
            path.push(parentheses);
            dfs_bt(n, path);

        }
    }
}
