import java.util.Scanner;

public class q_409_Longest_Palindrome {

    public static int longestPalindrome(String s) {
        int[] charCount = new int[128];
        for (char c : s.toCharArray()) {
            charCount[c]++;
        }
        int palindrome_length = 0;
        int odd_count = 0;
        for (int count : charCount) {
            palindrome_length += count / 2 * 2;
            if (count % 2 == 1) {
                odd_count = 1;
            }
        }
        return palindrome_length + odd_count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next();
        System.out.println(longestPalindrome(str));
    }
}
