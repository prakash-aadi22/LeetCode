import java.util.Scanner;

public class q_724_Find_Pivot_Index {
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftsum = 0;
        for (int ele : nums) {
            totalSum += ele;
        }
        for (int i = 0; i < nums.length; leftsum += nums[i++]) {
            if (leftsum * 2 == totalSum - nums[i]) {
                return i;
            }
        }
        return -1;
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
        System.out.println(pivotIndex(arr));
    }
}
