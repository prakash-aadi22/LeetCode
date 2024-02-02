import java.util.Scanner;

public class q_2423_Remove_Letter_To_Equalize_Frequency {

    public static boolean equalFrequency(String word) {
        int len = word.length();
        int[] count = new int[26];
        for (int i = 0; i < len; ++i) {
            char c = word.charAt(i);
            count[c - 'a']++;
        }
        for (int i = 0; i < len; ++i) {
            char c = word.charAt(i);
            count[c - 'a']--;
            if (equalCount(count)) {
                return true;
            }
            count[c - 'a']++;
        }
        return false;
    }

    public static boolean equalCount(int[] count) {
        int c = 0;
        for (int i : count) {
            if (i == 0) {
                continue;
            } else if (c == 0) {
                c = i;
            } else if (c == i) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String s = sc.next();
        System.out.println(equalFrequency(s));
    }
}
