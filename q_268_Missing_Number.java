import java.util.Arrays;
import java.util.Scanner;

public class q_268_Missing_Number {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 1 && nums[0] == 1) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();
        int[] nums = new int[len];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter the " + i + "th element: ");
            nums[i] = sc.nextInt();
        }
        System.out.println(missingNumber(nums));
    }
}
