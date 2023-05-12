import java.util.*;

public class q_414_Third_Maximum_Number {
    public static int thirdMax(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        for (int num : nums) {
            uniqueNums.add(num);
        }
        if (uniqueNums.size() < 3) {
            return Collections.max(uniqueNums);
        } else {
            List<Integer> sortedNums = new ArrayList<>(uniqueNums);
            sortedNums.sort(Collections.reverseOrder());
            return sortedNums.get(2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();
        int[] nums = new int[len];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter the value of " + i + " element of the array: ");
            nums[i] = sc.nextInt();
        }
        System.out.println(thirdMax(nums));
    }
}
