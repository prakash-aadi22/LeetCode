import java.util.Scanner;

public class q_375_Guess_Number_Higher_or_Lower_II {
    public static int getMoneyAmount(int n) {
        int[][] f = new int[n + 1][n + 1];
        int beginIdx, endIdx;
        int[] index = new int[n + 1];
        int[] value = new int[n + 1];
        int a, b, k0, v, f1, f2;
        for (b = 2; b <= n; b++) {
            k0 = b - 1;
            beginIdx = 0;
            endIdx = -1;
            for (a = b - 1; a > 0; a--) {
                while (f[a][k0 - 1] > f[k0 + 1][b]) {
                    k0--;
                }
                while (beginIdx <= endIdx && index[beginIdx] > k0) {
                    beginIdx++;
                }
                v = f[a + 1][b] + a;
                while (beginIdx <= endIdx && v < value[endIdx]) {
                    endIdx--;
                }
                endIdx++;
                index[endIdx] = a;
                value[endIdx] = v;
                f1 = value[beginIdx];
                f2 = f[a][k0] + k0 + 1;
                f[a][b] = Math.min(f1, f2);
            }
        }
        return f[1][n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println(getMoneyAmount(n));
    }
}
