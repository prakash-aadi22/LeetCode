import java.util.Scanner;

public class q_1909_Remove_One_Element_to_Make_the_Array_Strictly_Increasing {
    public static boolean canBeIncreasing(int[] nums) {
        int count = 0;
        int violatingIndex = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                count++;
                violatingIndex = i - 1;
            }
            if (count > 1) {
                return false;
            }
        }
        return count == 0 || violatingIndex == 0 || violatingIndex == nums.length - 2 || nums[violatingIndex - 1]
                < nums[violatingIndex + 1] || nums[violatingIndex] < nums[violatingIndex + 2];
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
        System.out.println((canBeIncreasing(nums)));
    }
}
