import java.util.Scanner;

public class q_1071_Greatest_Common_Divisor_of_Strings {
    public static String gcdOfStrings(String str1, String str2) {
        if (!str1.concat(str2).equals(str2.concat(str1))) {
            return "";
        }
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the second String: ");
        String s2 = sc.nextLine();
        System.out.println(gcdOfStrings(s1, s2));
    }
}
