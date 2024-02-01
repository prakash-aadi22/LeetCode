import java.util.Scanner;

public class q_3_Longest_Substring_Without_Repeating_Characters {

    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty() || s.length() == 1) {
            return s.length();
        }
        char[] chars = s.toCharArray();
        int max = 1;
        int start = 0, end = 1;
        while (end < s.length()) {
            for (int i = start; i < end; i++) {
                if (chars[i] == chars[end]) {
                    start = i + 1;
                    break;
                }
            }
            end++;
            max = Math.max(end - start, max);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next();
        System.out.println(lengthOfLongestSubstring(str));
    }
}
