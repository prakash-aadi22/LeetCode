import java.util.Scanner;

public class q_1221_Split_a_String_in_Balanced_Strings {
    public static int balancedStringSplit(String s) {
        int res = 0, cnt = 0;
        for (int i = 0; i < s.length(); ++i) {
            cnt += s.charAt(i) == 'L' ? 1 : -1;
            if (cnt == 0) {
                ++res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String input = sc.nextLine();
        System.out.println(balancedStringSplit(input));
    }
}
