import java.util.Scanner;

public class q_541_Reverse_String_II {

    public static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int i = 0;
        int n = arr.length;
        while (i < n) {
            int j = Math.min(i + k - 1, n - 1);
            swap(arr, i, j);
            i = i + 2 * k;
        }
        return new String(arr);
    }

    public static void swap(char[] arr, int i, int j) {
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the s: ");
        String s = sc.next();
        System.out.print("Enter the k: ");
        int k = sc.nextInt();
        System.out.println(reverseStr(s, k));
    }
}
