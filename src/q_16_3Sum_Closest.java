import java.util.Scanner;

public class q_16_3Sum_Closest {

    public static int threeSumClosest(int[] nums, int target) {
        byte[] occurrences = new byte[2001];
        for (int num : nums) {
            occurrences[num + 1000]++;
        }
        for (int count = 0, index = 0; count < 2001; count++) {
            for (int repetitions = occurrences[count]; repetitions-- > 0; ) {
                nums[index++] = count - 1000;
            }
        }
        int low = 0, high = nums.length - 1, closestSum = Integer.MAX_VALUE;
        for (int end = high - 1; low < end; low++) {
            for (int sum, i = high, j = low + 1; j < i; ) {
                if ((sum = nums[low] + nums[i] + nums[j]) == target) {
                    return sum;
                } else if ((sum > target ? sum - target - i + i-- : target - sum - j + j++) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }
            }
        }
        return closestSum;
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
        System.out.print("Enter the value of the target: ");
        int target = sc.nextInt();
        System.out.println(threeSumClosest(num, target));
    }
}
