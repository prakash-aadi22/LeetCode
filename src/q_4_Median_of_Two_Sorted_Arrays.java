import java.util.Arrays;
import java.util.Scanner;

public class q_4_Median_of_Two_Sorted_Arrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, ans, 0, nums1.length);
        System.arraycopy(nums2, 0, ans, nums1.length, nums2.length);
        Arrays.sort(ans);
        if (ans.length % 2 != 0) {
            return (ans[ans.length / 2]);
        } else {
            return ((double) (ans[(ans.length / 2) - 1] + (ans[ans.length / 2])) / 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of first array: ");
        int len1 = sc.nextInt();
        int[] arr1 = new int[len1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter the value of " + i + " element of the array: ");
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the length of second array: ");
        int len2 = sc.nextInt();
        int[] arr2 = new int[len2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter the value of " + i + " element of the array: ");
            arr2[i] = sc.nextInt();
        }
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
}
