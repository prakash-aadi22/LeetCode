import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q_1447_Simplified_Fractions {

    public static List<String> simplifiedFractions(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 2; i <= n; ++i) {
            for (int j = 1; j < i; ++j) {
                if (gcd(j, i) == 1) {
                    String str = j + "/" + i;
                    ans.add(str);
                }
            }
        }
        return ans;
    }

    private static int gcd(int x, int y) {
        return x == 0 ? y : gcd(y % x, x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.println(simplifiedFractions(x));
    }
}
