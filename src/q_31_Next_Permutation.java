import java.util.Arrays;
import java.util.Scanner;

public class q_31_Next_Permutation {

    public static void nextPermutation(int[] nums) {
        int idx = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            for (int i = 0; i < nums.length / 2; i++) {
                int temp = nums[nums.length - 1 - i];
                nums[nums.length - 1 - i] = nums[i];
                nums[i] = temp;
            }
            return;
        }
        for (int m = nums.length - 1; m > idx; m--) {
            if (nums[m] > nums[idx]) {
                int temp = nums[m];
                nums[m] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }
        int k = nums.length - 1;
        for (int j = idx + 1; j <= (nums.length + idx) / 2; j++) {
            int temp = nums[k];
            nums[k] = nums[j];
            nums[j] = temp;
            k--;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value for the " + i + " index: ");
            arr[i] = sc.nextInt();
        }
        nextPermutation(arr);
    }
}
