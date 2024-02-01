import java.util.Scanner;

public class q_11_Container_With_Most_Water {

    public static int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int ret = 0;
        while (l < r) {
            int hl = height[l];
            int hr = height[r];
            int minH = Math.min(hl, hr);
            int size = area(minH, l, r);
            ret = Math.max(ret, size);
            while (l <= r && height[l] <= minH) {
                l++;
            }
            while (r >= l && height[r] <= minH) {
                r--;
            }
        }
        return ret;
    }

    private static int area(int height, int from, int to) {
        return height * (to - from);
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
        System.out.println(maxArea(nums));
    }
}
