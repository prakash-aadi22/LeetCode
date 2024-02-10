import java.util.Scanner;

public class q_1143_Longest_Common_Subsequence {
    public static int longestCommonSubsequence(String text1, String text2) {
        if (text1.equals(text2)) {
            return text1.length();
        }
        char[] tb1 = text1.toCharArray();
        char[] tb2 = text2.toCharArray();
        if (tb1.length > tb2.length) {
            int[] dp = new int[tb1.length + 1];
            for (char c : tb2) {
                int pc = 0, prc;
                for (int j = 0; j < tb1.length; j++) {
                    prc = pc;
                    pc = dp[j + 1];
                    if (c == tb1[j]) {
                        dp[j + 1] = prc + 1;
                    } else {
                        dp[j + 1] = Math.max(pc, dp[j]);
                    }
                }
            }
            return dp[tb1.length];
        } else {
            int[] dp = new int[tb2.length + 1];
            for (char c : tb1) {
                int pc = 0, prc;
                for (int j = 0; j < tb2.length; j++) {
                    prc = pc;
                    pc = dp[j + 1];
                    if (c == tb2[j]) {
                        dp[j + 1] = prc + 1;
                    } else {
                        dp[j + 1] = Math.max(pc, dp[j]);
                    }
                }
            }
            return dp[tb2.length];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String: ");
        String s1 = sc.next();
        System.out.print("Enter the second String: ");
        String s2 = sc.next();
        System.out.println(longestCommonSubsequence(s1, s2));
    }
}
