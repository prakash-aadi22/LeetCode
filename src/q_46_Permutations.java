import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q_46_Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        int n = nums.length - 1;
        backtrack(nums, 0, n);
        return ans;
    }

    static List<List<Integer>> ans = new ArrayList<>();

    public static List<Integer> convert(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        for (int e : nums) {
            lst.add(e);
        }
        return lst;
    }

    public static void backtrack(int[] nums, int idx, int N) {
        if (idx == N) {
            List<Integer> lst;
            lst = convert(nums);
            ans.add(lst);
        } else {
            for (int i = idx; i <= N; i++) {
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
                backtrack(nums, idx + 1, N);
                temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
            }
        }
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
        System.out.println((permute(arr)));
    }
}
