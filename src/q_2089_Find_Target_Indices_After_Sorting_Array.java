import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class q_2089_Find_Target_Indices_After_Sorting_Array {
    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                al.add(i);
            }
        }
        return al;
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
        System.out.print("Enter the value of target: ");
        int t = sc.nextInt();
        System.out.println(((targetIndices(arr, t))));
    }
}
