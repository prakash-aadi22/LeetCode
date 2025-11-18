import java.util.*;

public class q_3668_Restore_Finishing_Order {

    public static int[] recoverOrder(int[] order, int[] friends) {
        int[] f = new int[friends.length];
        int k = 0;

        for (int j : order) {
            for (int friend : friends) {
                if (j == friend) {
                    f[k] = j;
                    k++;
                    break;
                }
            }
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array 1: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of " + i + " element of the array: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the length of array 2: ");
        int len1 = sc.nextInt();
        int[] arr1 = new int[len1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter the value of " + i + " element of the array: ");
            arr1[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(recoverOrder(arr, arr1)));
    }
}
