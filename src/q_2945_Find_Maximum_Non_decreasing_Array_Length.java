import java.util.Scanner;

public class q_2945_Find_Maximum_Non_decreasing_Array_Length {
    public static int findMaximumLength(int[] nums) {

        int n = nums.length;
        int[] que = new int[n + 1];
        int write = 0, read = 0;

        long[] prefixSum = new long[n + 1];
        long[] sums = new long[n + 1];
        int[] count = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];

            while (read < write && prefixSum[i] >= sums[read + 1])
                read++;

            int j = que[read];
            long subArraySum = prefixSum[i] - prefixSum[j];
            count[i] = count[j] + 1;

            long sum = prefixSum[i] + subArraySum;

            while (sum <= sums[write])
                write--;

            que[++write] = i;
            sums[write] = sum;
        }
        return count[n];
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
        int result = findMaximumLength(nums);
        System.out.println("Maximum length of a non-decreasing subArray: " + result);
    }
}
