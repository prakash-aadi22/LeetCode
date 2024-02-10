import java.util.Scanner;

public class q_875_Koko_Eating_Bananas {
    public static int minEatingSpeed(int[] piles, int h) {
        long totalBananas = 0;
        for (int p : piles) {
            totalBananas += p;
        }
        int left = (int) ((totalBananas - 1) / h) + 1;
        int right = (int) ((totalBananas - piles.length) / (h - piles.length + 1)) + 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int totalHours = 0;
            for (int p : piles) {
                totalHours += (p - 1) / mid + 1;
            }
            if (totalHours > h) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
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
        System.out.print("Enter the value of h: ");
        int h = sc.nextInt();
        System.out.println(minEatingSpeed(nums, h));
    }
}
