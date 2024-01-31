import java.util.Scanner;

public class q_392_Is_Subsequence {

    public static boolean isSubsequence(String s, String t) {
        char[] sh = s.toCharArray();
        char[] th = t.toCharArray();
        int i = 0;
        int j = 0;
        while (i < sh.length && j < th.length) {
            if (sh[i] == th[j]) {
                i++;
            }
            j++;

        }
        return i == sh.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter s: ");
        String s = sc.next();
        System.out.print("Enter t: ");
        String t = sc.next();
        System.out.println(isSubsequence(s, t));
    }
}
