import java.util.HashSet;
import java.util.Scanner;

public class q_217_Contains_Duplicate {

    public static boolean containsDuplicate(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    return true;
//                }
//            }
//        }
//        return false;
//        ArrayList<Integer> al = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (al.contains(nums[i])) {
//                return true;
//            }
//            al.add(nums[i]);
//        }
//        return false;
        HashSet<Integer> hSet = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
        for (int n : nums) {
            if (hSet.contains(n)) {
                return true;
            }
//            hSet.add(nums[i]);
            hSet.add(n);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of " + i + " element of the array: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(containsDuplicate(arr));
    }
}
