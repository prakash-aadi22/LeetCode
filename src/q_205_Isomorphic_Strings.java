import java.util.Scanner;

public class q_205_Isomorphic_Strings {
    public static boolean isIsomorphic(String s, String t) {
        int[] a = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char sCh = s.charAt(i);
            char tCh = t.charAt(i);
            if (a[sCh] == 0) {
                for (int j = 0; j < 256; j++) {
                    if (a[j] == tCh)
                        return false;
                }
                a[sCh] = tCh;
            } else if (a[sCh] != tCh) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String: ");
        String str1 = sc.next();
        System.out.print("Enter the second String: ");
        String str2 = sc.next();
        System.out.println(isIsomorphic(str1, str2));
    }
}
