import java.util.Arrays;
import java.util.Scanner;

public class q_475_Heaters {
    public static int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int result = Integer.MIN_VALUE;
        for (int house : houses) {
            int index = Arrays.binarySearch(heaters, house);
            if (index < 0) {
                index = -(index + 1);
            }
            int dist1 = index - 1 >= 0 ? house - heaters[index - 1] : Integer.MAX_VALUE;
            int dist2 = index < heaters.length ? heaters[index] - house : Integer.MAX_VALUE;

            result = Math.max(result, Math.min(dist1, dist2));
        }
        return result;
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
        System.out.println((findRadius(arr1, arr2)));
    }
}
