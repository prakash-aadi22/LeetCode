import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q_166_Fraction_to_Recurring_Decimal {
    public static String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }
        StringBuilder ans = new StringBuilder();
        ans.append(((numerator > 0) ^ (denominator > 0)) ? "-" : "");
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);
        ans.append(num / den);
        num %= den;
        if (num == 0) {
            return ans.toString();
        }
        ans.append(".");
        Map<Long, Integer> map = new HashMap<>();
        map.put(num, ans.length());
        int index;
        while (num != 0) {
            num *= 10;
            ans.append(num / den);
            num %= den;
            if (map.containsKey(num)) {
                index = map.get(num);
                ans.insert(index, "(");
                ans.append(")");
                return ans.toString();
            } else {
                map.put(num, ans.length());
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of n: ");
        int d = sc.nextInt();
        System.out.println(fractionToDecimal(n, d));
    }
}
