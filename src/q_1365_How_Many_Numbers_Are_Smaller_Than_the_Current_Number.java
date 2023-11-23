import java.util.Arrays;
import java.util.Scanner;

public class q_1365_How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
                ans[i] = count;
            }
            count = 0;
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
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}
