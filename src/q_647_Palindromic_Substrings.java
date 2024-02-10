import java.util.Scanner;

public class q_647_Palindromic_Substrings {
    static int count = 0;

    public static int countSubstrings(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            extendPalindrome(s, i, i);
            extendPalindrome(s, i, i + 1);
        }
        return count;
    }

    private static void extendPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.next();
        System.out.println(countSubstrings(s));
    }
}
