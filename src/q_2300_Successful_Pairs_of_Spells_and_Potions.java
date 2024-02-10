import java.util.Arrays;
import java.util.Scanner;

public class q_2300_Successful_Pairs_of_Spells_and_Potions {
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int maxP = 0;
        for (int p : potions) {
            maxP = Math.max(maxP, p);
        }
        int[] suf = new int[maxP + 1];
        for (int p : potions) {
            suf[p]++;
        }
        for (int i = suf.length - 2; i >= 0; i--) {
            suf[i] += suf[i + 1];
        }
        for (int i = 0; i < spells.length; i++) {
            long v = (success + spells[i] - 1) / spells[i];
            spells[i] = v > maxP ? 0 : suf[(int) v];
        }
        return spells;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of first array: ");
        int len1 = sc.nextInt();
        int[] nums1 = new int[len1];
        for (int i = 0; i < nums1.length; i++) {
            System.out.print("Enter the " + i + "th value: ");
            nums1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of second array: ");
        int len2 = sc.nextInt();
        int[] nums2 = new int[len2];
        for (int i = 0; i < nums2.length; i++) {
            System.out.print("Enter the " + i + "th value: ");
            nums2[i] = sc.nextInt();
        }
        System.out.print("Enter the value of success: ");
        int s = sc.nextInt();
        System.out.println(Arrays.toString(successfulPairs(nums1, nums2, s)));
    }
}
