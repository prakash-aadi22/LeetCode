import java.util.*;

public class q_241_Different_Ways_to_Add_Parentheses {
    private static final Map<String, List<Integer>> memo = new HashMap<>();

    public static List<Integer> diffWaysToCompute(String expression) {
        return dfs(expression);
    }

    private static List<Integer> dfs(String exp) {
        if (memo.containsKey(exp)) {
            return memo.get(exp);
        }
        List<Integer> ans = new ArrayList<>();
        if (exp.length() < 3) {
            ans.add(Integer.parseInt(exp));
            return ans;
        }
        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);
            if (c == '-' || c == '+' || c == '*') {
                List<Integer> left = dfs(exp.substring(0, i));
                List<Integer> right = dfs(exp.substring(i + 1));
                for (int a : left) {
                    for (int b : right) {
                        if (c == '-') {
                            ans.add(a - b);
                        } else if (c == '+') {
                            ans.add(a + b);
                        } else {
                            ans.add(a * b);
                        }
                    }
                }
            }
        }
        memo.put(exp, ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the expression: ");
        String s = sc.next();
        System.out.println(diffWaysToCompute(s));
    }
}
