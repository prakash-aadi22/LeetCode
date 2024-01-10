import java.util.Arrays;
import java.util.Scanner;

public class q_283_Move_Zeroes {
    public static void moveZeroes(int[] nums) {
//        int nonZeroIndex = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                int temp = nums[i];
//                nums[i] = nums[nonZeroIndex];
//                nums[nonZeroIndex] = temp;
//                nonZeroIndex++;
//            }
//        }
//        System.out.println(Arrays.toString(nums));

        int i = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[i] = num;
                i++;
            }
        }
        while (i <= nums.length - 1) {
            nums[i] = 0;
            i++;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of " + i + " index: ");
            arr[i] = sc.nextInt();
        }
        moveZeroes(arr);
    }
}
