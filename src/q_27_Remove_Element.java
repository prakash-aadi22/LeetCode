import java.util.Scanner;

public class q_27_Remove_Element {
    public static int removeElement(int[] nums, int val) {
        int left_most_index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[left_most_index++] = nums[i];
            }
        }
        return left_most_index;
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
        System.out.print("Enter the value to remove: ");
        int val = sc.nextInt();
        System.out.println(removeElement(nums, val));
    }
}
