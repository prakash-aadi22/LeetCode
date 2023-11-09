import java.util.Arrays;
import java.util.Scanner;

public class q_1470_Shuffle_the_Array {
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];
        }
        return ans;
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
        System.out.print("Enter the value of n(mid of array): ");
        int n = sc.nextInt();
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
}
