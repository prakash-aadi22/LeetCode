import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q_216_Combination_Sum_III {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result, k, n, 1, new ArrayList<>());
        return result;
    }

    private static void helper(List<List<Integer>> result, int k, int n, int start, List<Integer> tmp) {
        if (n == 0 && tmp.size() == k) {
            result.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = start; i <= 9; i++) {
            tmp.add(i);
            helper(result, k, n - i, i + 1, tmp);
            tmp.remove(tmp.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();
        System.out.println((combinationSum3(n1, n2)));
    }
}
