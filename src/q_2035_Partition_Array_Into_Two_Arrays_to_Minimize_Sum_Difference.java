import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class q_2035_Partition_Array_Into_Two_Arrays_to_Minimize_Sum_Difference {
    static void addToMap(int[] nums, int l, int r, int p, TreeMap<Integer, ArrayList<Integer>> m, int dif, int top, boolean toTop) {
        if (p == r + 1) {
            if (top >= 0) {
                if (toTop) {
                    m.computeIfAbsent(top, (key) -> new ArrayList<>()).add(dif);
                } else {
                    m.computeIfAbsent(-top, (key) -> new ArrayList<>()).add(-dif);
                }
            }
            if (top <= 0) {
                if (!toTop) {
                    m.computeIfAbsent(top, (key) -> new ArrayList<>()).add(dif);
                } else {
                    m.computeIfAbsent(-top, (key) -> new ArrayList<>()).add(-dif);
                }
            }
            return;
        }
        addToMap(nums, l, r, p + 1, m, dif + nums[p], top + 1, toTop);
        if (p != l) {
            addToMap(nums, l, r, p + 1, m, dif - nums[p], top - 1, toTop);
        }
    }

    public static int minimumDifference(int[] nums) {
        int n = nums.length;
        TreeMap<Integer, ArrayList<Integer>> m1 = new TreeMap<>();
        TreeMap<Integer, ArrayList<Integer>> m2 = new TreeMap<>();
        addToMap(nums, 0, n / 2 - 1, 0, m1, 0, 0, true);
        addToMap(nums, n / 2, n - 1, n / 2, m2, 0, 0, false);
        int ret = Integer.MAX_VALUE;
        for (int top : m1.keySet()) {
            int[] arr1 = new int[m1.get(top).size()];
            int[] arr2 = new int[m2.get(-top).size()];
            int i = 0;
            for (int dif : m1.get(top)) {
                arr1[i++] = dif;
            }
            i = 0;
            for (int dif : m2.get(-top)) {
                arr2[i++] = dif;
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            int p1 = 0;
            int p2 = arr2.length - 1;
            while (p1 < arr1.length && p2 >= 0) {
                ret = Math.min(ret, Math.abs(arr1[p1] + arr2[p2]));
                if (arr2[p2] > -arr1[p1]) {
                    p2--;
                } else {
                    p1++;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the value of array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Result: " + minimumDifference(nums));
    }
}
