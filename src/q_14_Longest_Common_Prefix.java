import java.util.Scanner;

public class q_14_Longest_Common_Prefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (String s : strs) {
            while (s.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the string array: ");
        int len = sc.nextInt();
        String[] str = new String[len];
        for (int i = 0; i < str.length; i++) {
            System.out.print("Enter the value of " + i + " element of the array: ");
            str[i] = sc.next();
        }
        System.out.println(longestCommonPrefix(str));
    }
}
