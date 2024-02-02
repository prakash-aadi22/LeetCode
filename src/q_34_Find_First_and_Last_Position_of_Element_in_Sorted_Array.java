import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class q_34_Find_First_and_Last_Position_of_Element_in_Sorted_Array {

    public static int[] searchRange(int[] nums, int target) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                al.add(i);
            }
        }
        int[] ans = new int[2];
        if (al.isEmpty()) {
            ans[0] = -1;
            ans[1] = -1;
        } else {
            ans[0] = al.get(0);
            ans[1] = al.get(al.size() - 1);
        }
        return ans;
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
        System.out.println((Arrays.toString(searchRange(arr, t))));
    }
}
