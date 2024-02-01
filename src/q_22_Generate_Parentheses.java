import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q_22_Generate_Parentheses {

    public static void recurSolve(StringBuilder up, int close, int open, int target, List<String> res) {
        if (close == open && close == target) {
            res.add(up.toString());
            return;
        }
        if (close < open && open != target) {
            up.append("(");
            recurSolve(up, close, open + 1, target, res);
            up.deleteCharAt(up.length() - 1);
            up.append(")");
            recurSolve(up, close + 1, open, target, res);
            up.deleteCharAt(up.length() - 1);
        } else if (close >= open && close <= target) {
            up.append("(");
            recurSolve(up, close, open + 1, target, res);
            up.deleteCharAt(up.length() - 1);
        } else if (open == target) {
            up.append(")");
            recurSolve(up, close + 1, open, target, res);
            up.deleteCharAt(up.length() - 1);
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        recurSolve(sb, 0, 0, n, res);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.println(generateParenthesis(x));
    }
}
