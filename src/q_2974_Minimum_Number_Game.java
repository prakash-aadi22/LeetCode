import java.util.Arrays;
import java.util.Scanner;

public class q_2974_Minimum_Number_Game {
    public static int[] numberGame(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            arr[i] = nums[i + 1];
            arr[i + 1] = nums[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of " + i + "th index: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(numberGame(arr)));
    }
}
