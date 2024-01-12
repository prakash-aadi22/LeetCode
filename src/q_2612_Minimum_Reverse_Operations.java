import java.util.Arrays;
import java.util.Scanner;

public class q_2612_Minimum_Reverse_Operations {
    static final int inf = Integer.MAX_VALUE / 2;
    static int[] que = new int[100000];
    static int[] next = new int[100000];

    public static int[] minReverseOperations(int n, int p, int[] banned, int k) {
        final int[] ans = new int[n];
        Arrays.fill(ans, inf);
        ans[p] = 0;
        for (int x : banned)
            ans[x] = -1;

        for (int i = 0; i < n; i++) {
            next[i] = i + 2;
        }
        int write = 0;
        que[write++] = p;
        for (int i = 0; i < write; i++) {
            int u = que[i], v = ans[u] + 1, c = k - 1 - u;
            int min = c + 2 * Math.max(0, u - k + 1);
            int max = c + 2 * Math.min(u, n - k);
            int next1 = next[max];
            for (int j = min; j <= max; ) {
                if (v < ans[j]) {
                    ans[j] = v;
                    que[write++] = j;
                }
                final int next2 = next[j];
                next[j] = next1;
                j = next2;
            }
        }
        for (int i = 0; i < n; i++) {
            if (ans[i] == inf)
                ans[i] = -1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the value of p:");
        int p = sc.nextInt();
        System.out.println("Enter the size of banned array:");
        int bannedSize = sc.nextInt();
        int[] banned = new int[bannedSize];
        System.out.println("Enter the elements of banned array:");
        for (int i = 0; i < bannedSize; i++) {
            banned[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        System.out.println(Arrays.toString(minReverseOperations(n, p, banned, k)));
    }
}
