import java.util.Scanner;

public class q_790_Domino_and_Tromino_Tiling {
    public static int numTilings(int n) {
        long[] dp = new long[n + 3];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 5;
        for (int i = 3; i < n; i++) {
            dp[i] = (dp[i - 1] * 2 + dp[i - 3]) % 1000000007;
        }
        return (int) dp[n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(numTilings(n));
    }
}
