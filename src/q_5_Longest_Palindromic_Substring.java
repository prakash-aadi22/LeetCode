import java.util.Scanner;

public class q_5_Longest_Palindromic_Substring {
    int start = 0;
    int end = 0;

    private void palindrome(char[] ch, int i) {
        int a = i;
        int b = i;
        int n = ch.length;
        if (i >= n - 1) return;
        while (b < n - 1 && ch[b] == ch[b + 1]) {
            b++;
        }
        i = b;
        while (a > 0 && b < n - 1 && ch[a - 1] == ch[b + 1]) {
            a--;
            b++;
        }
        if ((end - start) < (b - a)) {
            end = b;
            start = a;
        }
        palindrome(ch, i + 1);
    }

    public String longestPalindrome(String s) {
        char[] ch = s.toCharArray();
        palindrome(ch, 0);
        return s.substring(start, end + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next();
        q_5_Longest_Palindromic_Substring obj = new q_5_Longest_Palindromic_Substring();
        System.out.println(obj.longestPalindrome(str));
    }
}
