import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q_728_Self_Dividing_Numbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isValid(i)) {
                res.add(i);
            }
        }
        return res;
    }

    static boolean isValid(int i) {
        int n = i;
        while (n > 0) {
            if (n % 10 == 0) {
                return false;
            }
            if (i % (n % 10) != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the left number: ");
        int l = sc.nextInt();
        System.out.print("Enter the right number: ");
        int r = sc.nextInt();
        System.out.println(selfDividingNumbers(l, r));
    }
}
