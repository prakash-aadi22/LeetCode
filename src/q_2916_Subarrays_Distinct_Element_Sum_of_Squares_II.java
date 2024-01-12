import java.util.HashMap;
import java.util.Scanner;

public class q_2916_Subarrays_Distinct_Element_Sum_of_Squares_II {
    static final int MOD = 1_000_000_007;

    static class BIT {
        int n;
        long[] diff;
        long[] idiff;

        BIT(int n) {
            this.n = n + 1;
            this.diff = new long[this.n + 1];
            this.idiff = new long[this.n + 1];
        }

        private static long query(int qi, long[] bit) {
            long ans = 0L;
            while (qi > 0) {
                ans += bit[qi];
                qi &= qi - 1;
            }
            return ans;
        }

        private static void update(int qi, long delta, long[] bit) {
            while (qi < bit.length) {
                bit[qi] += delta;
                qi += qi & -qi;
            }
        }

        void rangeUpdate(int qL, int qR) {
            ++qL;
            ++qR;
            update(qL, 1, this.diff);
            update(qR + 1, -1, this.diff);
            update(qL, qL - 1, this.idiff);
            update(qR + 1, (long) qR * -1, this.idiff);
        }

        long rangeQuery(int qL, int qR) {
            final long preR = (qR + 1) * query(qR + 1, this.diff) - query(qR + 1, this.idiff);
            final long preL = qL * query(qL, this.diff) - query(qL, this.idiff);
            return preR - preL;
        }

    }

    public static int sumCounts(int[] nums) {
        final int n = nums.length;
        HashMap<Integer, Integer> last = new HashMap<>();
        BIT bit = new BIT(n);
        long ans = 0L;
        long s = 0L;
        for (int i = 0; i < n; ++i) {
            final int lastI = last.getOrDefault(nums[i], -1);
            final long delta = 2 * bit.rangeQuery(lastI + 1, i) + i - lastI;
            s += delta;
            s %= MOD;
            ans += s;
            ans %= MOD;
            bit.rangeUpdate(lastI + 1, i);
            last.put(nums[i], i);
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Maximum length of a non-decreasing subarray: " + sumCounts(nums));
    }
}