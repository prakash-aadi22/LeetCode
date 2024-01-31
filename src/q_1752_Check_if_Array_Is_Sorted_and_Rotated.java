import java.util.Scanner;

public class q_1752_Check_if_Array_Is_Sorted_and_Rotated {

    public static boolean check(int[] nums) {
        int irregularities = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] > nums[(i + 1) % length]) {
                irregularities += 1;
            }
        }
        return irregularities <= 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(check(arr));
    }
}
