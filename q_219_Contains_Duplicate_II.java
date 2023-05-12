import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class q_219_Contains_Duplicate_II {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) {
            return false;
        }
        Set<Integer> slidingWindow = new HashSet<>();
        for (int index = 0; index < nums.length; index++) {
            if (slidingWindow.contains(nums[index])) {
                return true;
            }
            if (index >= k) {
                slidingWindow.remove(nums[index - k]);
            }
            slidingWindow.add(nums[index]);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter the value of " + i + " index: ");
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the element: ");
        int k = sc.nextInt();
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}
