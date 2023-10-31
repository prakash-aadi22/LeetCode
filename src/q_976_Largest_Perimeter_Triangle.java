import java.util.Arrays;
import java.util.Scanner;

public class q_976_Largest_Perimeter_Triangle {
    public static int largestPerimeter(int[] nums) {
        int perimeter = 0, max;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] + nums[i + 1] > nums[i + 2]) {
                max = nums[i] + nums[i + 1] + nums[i + 2];
                if (max >= perimeter){
                    perimeter = max;
                }
            }
        }
        return perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of arr: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(largestPerimeter(arr));
    }
}
