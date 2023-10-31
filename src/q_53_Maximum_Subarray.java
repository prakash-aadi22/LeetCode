import java.util.Scanner;

public class q_53_Maximum_Subarray {
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(sum, max);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
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
        System.out.println(maxSubArray(arr));
    }
}
