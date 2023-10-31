import java.util.*;

public class q_448_Find_All_Numbers_Disappeared_in_an_Array {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l = new ArrayList<>();
        Arrays.sort(nums);
        Set<Integer> s = new HashSet<>();
        for (int num : nums) {
            s.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!s.contains(i)){
                l.add(i);
            }
        }
        return l;
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
        System.out.println(findDisappearedNumbers(nums));
    }
}
