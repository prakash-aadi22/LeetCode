import java.util.Scanner;

public class q_1043_Partition_Array_for_Maximum_Sum {

    public static int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp = new int[arr.length + 1];
        for (int index = arr.length - 1; index >= 0; index--) {
            int max = Integer.MIN_VALUE;
            int ans = Integer.MIN_VALUE;
            int len = 0;
            for (int i = index; i < index + k && i < arr.length; i++) {
                len++;
                max = Math.max(max, arr[i]);
                ans = Math.max(ans, len * max + dp[i + 1]);
            }
            dp[index] = ans;
        }
        return dp[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();
        int[] nums = new int[len];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter the value of " + i + ": ");
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        System.out.println((maxSumAfterPartitioning(nums, k)));
    }
}
