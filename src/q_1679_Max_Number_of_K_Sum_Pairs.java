import java.util.Arrays;
import java.util.Scanner;

public class q_1679_Max_Number_of_K_Sum_Pairs {
    public static int maxOperations(int[] nums, int k) {
        int left = 0;
        int counter = 0;
        int fl = 0;
        for (int i : nums) {
            if (i < k) {
                nums[fl++] = i;
            }
        }
        Arrays.sort(nums, 0, fl);
        int right = fl - 1;
        while (left < right) {
            if ((nums[left] + nums[right]) == k) {
                counter++;
                left++;
                right--;
            } else if ((nums[left] + nums[right]) > k) {
                right--;
            } else {
                left++;
            }

        }
        return counter;
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
        System.out.print("Enter the value of the target: ");
        int t = sc.nextInt();
        System.out.println((maxOperations(arr, t)));
    }
}
