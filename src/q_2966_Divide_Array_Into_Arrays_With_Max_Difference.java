import java.util.Arrays;
import java.util.Scanner;

public class q_2966_Divide_Array_Into_Arrays_With_Max_Difference {

    public static int[][] divideArray(int[] nums, int k) {
        if (nums.length % 3 != 0) {
            return new int[0][0];
        }
        int size = nums.length;
        int max = 0;
        for (int n : nums) {
            max = Math.max(max, n);
        }
        int[] frequencies = new int[max + 1];
        for (int n : nums) {
            ++frequencies[n];
        }
        int[][] subs = new int[size / 3][3];
        for (int n = 1, r = 0, c = 0; r < subs.length && n <= max; ) {
            if (frequencies[n] == 0) {
                ++n;
            } else if (c == subs[r].length) {
                ++r;
                c = 0;
            } else if (c == 0 || n - subs[r][0] <= k) {
                subs[r][c] = n;
                --frequencies[n];
                ++c;
            } else {
                return new int[0][0];
            }
        }
        return subs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the String for the " + i + " index: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        System.out.println(Arrays.deepToString(divideArray(arr, k)));
    }
}
