import java.util.Arrays;
import java.util.Scanner;

public class q_1929_Concatenation_of_Array {
    public static int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len * 2];
        System.arraycopy(nums, 0, ans, 0, len);
        System.arraycopy(nums, 0, ans, len, len);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();
        int[] nums = new int[len];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter the value of " + i + " element of the array: ");
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}
