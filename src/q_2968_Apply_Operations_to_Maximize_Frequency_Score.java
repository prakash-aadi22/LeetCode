import java.util.Arrays;
import java.util.Scanner;

public class q_2968_Apply_Operations_to_Maximize_Frequency_Score {
    public static int maxFrequencyScore(int[] nums, long k) {
        int ans = 0;
        long cost = 0;
        Arrays.sort(nums);
        for (int l = 0, r = 0; r < nums.length; ++r) {
            cost += nums[r] - nums[(l + r) / 2];
            while (cost > k)
                cost -= nums[(l + r + 1) / 2] - nums[l++];
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of " + i + " element of the array: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of the target: ");
        int t = sc.nextInt();
        System.out.println(maxFrequencyScore(arr, t));
    }
}
