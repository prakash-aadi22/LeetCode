import java.util.Scanner;

public class q_2729_Check_if_The_Number_is_Fascinating {
    public static boolean isFascinating(int n) {
//        return n == 192 || n == 219 || n == 273 || n == 327;
        int[] digits = new int[10];
        int cnt = 3;
        int nn = n;
        while (cnt > 0) {
            while (nn > 0) {
                int di = nn % 10;
                if (digits[di] > 0) return false;
                digits[di]++;
                nn /= 10;
            }
            nn = cnt-- * n;
        }
        int count = 0;
        for (int i = 1; i < 10; i++) {
            if (!(digits[i] == 1)) {
                return false;
            } else {
                count++;
            }
        }
        return count == 9 && digits[0] == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the purchase amount: ");
        int n = sc.nextInt();
        System.out.println(isFascinating(n));
    }
}
