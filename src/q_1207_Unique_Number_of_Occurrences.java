import java.util.Scanner;

public class q_1207_Unique_Number_of_Occurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for (int j : arr) {
            if (j < min) min = j;
            if (j > max) max = j;
        }
        int[] freq = new int[max - min + 1];
        int[] count = new int[n + 1];
        for (int j : arr) {
            freq[j - min]++;
        }
        for (int j : freq) {
            if (j != 0) count[j]++;
            if (count[j] >= 2) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of " + i + " element of the array: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(uniqueOccurrences(arr));
    }
}
