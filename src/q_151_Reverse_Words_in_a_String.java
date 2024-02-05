import java.util.Scanner;

public class q_151_Reverse_Words_in_a_String {
    public static String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        String[] rev = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            rev[i] = str[(str.length - 1) - i];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rev.length - 1; i++) {
            sb.append(rev[i]).append(" ");
        }
        return sb.append(rev[rev.length - 1]).toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.next();
        System.out.println(reverseWords(s));
    }
}
