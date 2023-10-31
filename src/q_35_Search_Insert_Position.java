import java.util.Arrays;
import java.util.Scanner;

public class q_35_Search_Insert_Position {
    public static int searchInsert(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] >= target) {
//                return i;
//            }
//        }
//        return nums.length;

        int a = Arrays.binarySearch(nums, target);
//        System.out.println(a);
        if (a >= 0) {
            return a;
        } else {
            return Math.abs(a) - 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter the " + i + "th value: ");
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        System.out.println(searchInsert(nums, target));
    }
}
