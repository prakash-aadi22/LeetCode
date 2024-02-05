import java.util.Scanner;

class NumArray {
    int[] nums;

    public NumArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return nums[right];
        }
        return nums[right] - nums[left - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
public class q_303_Range_Sum_Query_Immutable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        NumArray numArray = new NumArray(nums);
        while (true) {
            System.out.print("Enter left index (or -1 to exit): ");
            int left = sc.nextInt();
            if (left == -1) {
                break;
            }
            System.out.print("Enter right index: ");
            int right = sc.nextInt();
            System.out.println("Sum of elements between indices " + left + " and " + right + ": " + numArray.sumRange(left, right));
        }
    }
}
