import java.util.Arrays;
import java.util.Scanner;

public class q_2574_Left_and_Right_Sum_Differences {

    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        for (int i = 0; i < n - 1; i++) {
            leftSum[i + 1] = nums[i] + leftSum[i];
        }
        for (int i = n - 1; i > 0; i--) {
            rightSum[i - 1] = nums[i] + rightSum[i];
        }
        for (int i = 0; i < n; i++) {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of " + i + "th index: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(leftRightDifference(arr)));
    }
}
