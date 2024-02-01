import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q_228_Summary_Ranges {
    public static List<String> summaryRanges(int[] nums) {
        int i = 0, j = 0;
        List<String> res = new ArrayList<>();
        while (j < nums.length) {
            if (j + 1 < nums.length && nums[j + 1] == nums[j] + 1) {
                j++;
            } else {
                if (i == j) {
                    res.add(String.valueOf(nums[i]));
                } else {
                    res.add(new StringBuilder(String.valueOf(nums[i])).append("->").append(nums[j]).toString());
                }
                i = j + 1;
                j = i;
            }
        }
        return res;
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
        System.out.println(summaryRanges(arr));
    }
}
