import java.util.Scanner;

public class q_643_Maximum_Average_Subarray_I {
    public static double findMaxAverage(int[] nums, int k) {
        int i = 1, sum = nums[0];
        while (i < k) {
            sum += nums[i++];
        }
        int max = sum;
        for (; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            if (max < sum) {
                max = sum;
            }
        }
        return (double) max / k;
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
        System.out.print("Enter the value of the K: ");
        int t = sc.nextInt();
        System.out.println(findMaxAverage(arr, t));
    }
}
