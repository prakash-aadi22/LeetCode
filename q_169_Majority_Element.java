import java.util.Arrays;
import java.util.Scanner;

public class q_169_Majority_Element {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter the value of " + i + " index: ");
            nums[i] = sc.nextInt();
        }
        System.out.println(majorityElement(nums));
    }
}
