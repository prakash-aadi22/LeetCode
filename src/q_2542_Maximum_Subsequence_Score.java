import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q_2542_Maximum_Subsequence_Score {
    public static long maxScore(int[] nums1, int[] nums2, int k) {
        int max2 = 0;
        for (int x : nums2) {
            if (x > max2) {
                max2 = x;
            }
        }
        List<Integer>[] map = new List[max2 + 1];
        int n = nums1.length;
        for (int i = 0; i < n; ++i) {
            if (map[nums2[i]] == null) {
                map[nums2[i]] = new ArrayList<>();
            }
            map[nums2[i]].add(nums1[i]);
        }
        int max1 = 0;
        for (int x : nums1) {
            if (x > max1) {
                max1 = x;
            }
        }
        int[] count = new int[max1 + 1];
        int min1 = -1;
        long sum = 0, result = 0;
        for (int num2 = max2; num2 >= 0; --num2) {
            if (map[num2] == null) {
                continue;
            }
            for (int num1 : map[num2]) {
                if (num1 < min1) {
                    continue;
                }
                ++count[num1];
                sum += num1;
                if (--k <= 0) {
                    result = Math.max(result, sum * num2);
                    if (min1 == -1) {
                        ++min1;
                    }
                    while (count[min1] == 0) {
                        ++min1;
                    }
                    sum -= min1;
                    --count[min1];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size first of array: ");
        int len1 = sc.nextInt();
        int[] nums1 = new int[len1];
        for (int i = 0; i < nums1.length; i++) {
            System.out.print("Enter the " + i + "th value: ");
            nums1[i] = sc.nextInt();
        }
        System.out.print("Enter the size second of array: ");
        int len2 = sc.nextInt();
        int[] nums2 = new int[len2];
        for (int i = 0; i < nums2.length; i++) {
            System.out.print("Enter the " + i + "th value: ");
            nums2[i] = sc.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        System.out.println(maxScore(nums1, nums2, k));
    }
}
