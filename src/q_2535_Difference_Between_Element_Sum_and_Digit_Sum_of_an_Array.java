import java.util.Scanner;

public class q_2535_Difference_Between_Element_Sum_and_Digit_Sum_of_an_Array {
    public static int differenceOfSum(int[] nums) {
//        int elementSum = 0, digitSum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            elementSum += nums[i];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > 9) {
//                while (nums[i] != 0) {
//                    int t = nums[i] % 10;
//                    digitSum += t;
//                    nums[i] /= 10;
//                }
//            } else {
//                digitSum += nums[i];
//            }
//        }
//        return Math.abs(elementSum - digitSum);
        int elementSum = 0, digitSum = 0;
        for (int i = 0; i < nums.length; i++) {
            elementSum += nums[i];
            while (nums[i] != 0) {
                int t = nums[i] % 10;
                digitSum += t;
                nums[i] /= 10;
            }
        }
        return Math.abs(elementSum - digitSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();
        int[] num = new int[len];
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter the value for the " + i + "th index: ");
            num[i] = sc.nextInt();
        }
        System.out.println(differenceOfSum(num));
    }
}
