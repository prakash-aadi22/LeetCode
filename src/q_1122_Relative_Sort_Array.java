import java.util.Arrays;
import java.util.Scanner;

public class q_1122_Relative_Sort_Array {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] cnt = new int[1001];
        for (int n : arr1) cnt[n]++;
        int i = 0;
        for (int n : arr2) {
            while (cnt[n]-- > 0) {
                arr1[i++] = n;
            }
        }
        for (int n = 0; n < cnt.length; n++) {
            while (cnt[n]-- > 0) {
                arr1[i++] = n;
            }
        }
        return arr1;
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
        System.out.println((Arrays.toString(relativeSortArray(arr1, arr2))));
    }
}
