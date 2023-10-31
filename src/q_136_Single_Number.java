import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class q_136_Single_Number {
    public static int singleNumber(int[] nums) {
//        int result = 0;
//        for (int i : nums) {
//            result ^= i;
//        }
//        return result;
        if (nums.length == 1) {
            return nums[0];
        }
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.contains(n)) {
                set.add(n);
            } else {
                set.remove(n);
            }
        }
        Iterator<Integer> iterator = set.iterator();
        Integer singleOne = iterator.next();
        return singleOne;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int len = sc.nextInt();
        int[] nums = new int[len];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter the " + i + "th value: ");
            nums[i] = sc.nextInt();
        }
        System.out.println(singleNumber(nums));
    }
}
