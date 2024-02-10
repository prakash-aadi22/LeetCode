import java.util.Arrays;
import java.util.Scanner;

public class q_72_Edit_Distance {
    public static int func(int i, int j, String s1, String s2, int[][] dp) {
        if (i < 0) {
            return (j + 1);
        }
        if (j < 0) {
            return (i + 1);
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (s1.charAt(i) == s2.charAt(j)) {
            return dp[i][j] = func(i - 1, j - 1, s1, s2, dp);
        }
        return dp[i][j] = 1 + Math.min(func(i - 1, j, s1, s2, dp), Math.min(func(i, j - 1, s1, s2, dp), func(i - 1, j - 1, s1, s2, dp)));
    }

    public static int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()][word2.length()];
        for (int[] rows : dp) {
            Arrays.fill(rows, -1);
        }
        return func(word1.length() - 1, word2.length() - 1, word1, word2, dp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String: ");
        String s1 = sc.next();
        System.out.print("Enter the second String: ");
        String s2 = sc.next();
        System.out.println(minDistance(s1, s2));
    }
}
