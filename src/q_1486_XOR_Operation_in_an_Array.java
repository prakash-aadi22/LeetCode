import java.util.Scanner;

public class q_1486_XOR_Operation_in_an_Array {
    public static int xorOperation(int n, int start) {
        int ans = 0;
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = start + (2 * i);
        }
        for (int i : nums) {
            ans ^= i;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter the start: ");
        int start = sc.nextInt();
        System.out.println(xorOperation(n, start));
    }
}
