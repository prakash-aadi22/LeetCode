import java.util.Scanner;

public class q_1657_Determine_if_Two_Strings_Are_Close {
    public static boolean closeStrings(String word1, String word2) {
        int n = word1.length();
        if (n != word2.length()) {
            return false;
        }
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        if (word1.equals(word2)) {
            return true;
        }
        byte[] bytes = new byte[n];
        word1.getBytes(0, n, bytes, 0);
        for (int b : bytes) {
            count1[b - 'a'] += 1;
        }
        word2.getBytes(0, n, bytes, 0);
        for (int b : bytes)
            count2[b - 'a'] += 1;
        int maxfreq = 0;
        for (int i = 0; i < 26; i++) {
            maxfreq = Math.max(maxfreq, Math.max(count1[i], count2[i]));
        }
        int[] freq = new int[maxfreq + 1];
        int count = 0;
        for (int i = 0; i < 26; i++) {
            int c1 = count1[i];
            int c2 = count2[i];
            if ((c1 == 0) ^ (c2 == 0)) {
                return false;
            }
            if (c1 != 0) {
                int f1 = freq[c1]++;
                int f2 = freq[c2]--;
                if (f1 == 0) {
                    count++;
                } else if (f1 == -1) {
                    count--;
                }
                if (f2 == 0) {
                    count++;
                } else if (f2 == 1) {
                    count--;
                }
            }
        }
        return count == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String: ");
        String s1 = sc.next();
        System.out.print("Enter the second String: ");
        String s2 = sc.next();
        System.out.println(closeStrings(s1, s2));
    }
}
