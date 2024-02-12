import java.util.Scanner;

public class q_1493_Longest_Subarray_of_1_s_After_Deleting_One_Element {
    public static int longestSubarray(int[] nums) {
        boolean zero_found = false;
        int prev_count = 0;
        int count = 0;
        int res = 0;
        int total = 0;
        int n = nums.length;
        for (int num : nums) {
            if (num == 0) {
                zero_found = true;
                total = prev_count + count;
                res = Math.max(total, res);
                prev_count = count;
                count = 0;
            } else {
                count += 1;
            }
        }
        total = prev_count + count;
        res = Math.max(total, res);
        if (zero_found) {
            return res;
        } else {
            return n - 1;
        }
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
        System.out.println(longestSubarray(arr));
    }
}
