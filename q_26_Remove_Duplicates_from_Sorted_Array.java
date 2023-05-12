import java.util.Scanner;

public class q_26_Remove_Duplicates_from_Sorted_Array {
    public static int removeDuplicates(int[] nums) {
//        Set<Integer> uniqueNums = new HashSet<>();
//        for (int num : nums) {
//            uniqueNums.add(num);
//        }
//        System.out.println(uniqueNums);
//        return uniqueNums.size();
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[count] != nums[i]) {
                nums[count + 1] = nums[i];
                count++;
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();
        int[] digits = new int[len];
        for (int i = 0; i < digits.length; i++) {
            System.out.print("Enter the value of " + i + " element of the array: ");
            digits[i] = sc.nextInt();
        }
        System.out.println(removeDuplicates(digits));
    }
}
