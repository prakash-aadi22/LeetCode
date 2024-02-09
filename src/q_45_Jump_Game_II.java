import java.util.Scanner;

public class q_45_Jump_Game_II {
    public static int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        return jump(nums, 0);
    }

    public static int jump(int[] nums, int start) {
        if (start + nums[start] >= nums.length - 1) {
            return 1;
        }
        int max = -1;
        int max_index = -1;
        for (int i = 1; i <= nums[start]; i++) {
            if (start + i + nums[start + i] > max) {
                max = start + i + nums[start + i];
                max_index = start + i;
            }
        }
        return jump(nums, max_index) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of " + i + " element of the array: ");
            arr[i] = sc.nextInt();
        }
        System.out.println((jump(arr)));
    }
}
