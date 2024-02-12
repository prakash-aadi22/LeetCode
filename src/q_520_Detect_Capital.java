import java.util.Scanner;

public class q_520_Detect_Capital {
    public static boolean detectCapitalUse(String word) {
        int cnt = 0;
        for (char c : word.toCharArray()) {
            if ('Z' - c >= 0) {
                cnt++;
            }
        }
        return ((cnt == 0 || cnt == word.length()) || (cnt == 1 && 'Z' - word.charAt(0) >= 0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        String s = sc.nextLine();
        System.out.println(detectCapitalUse(s));
    }
}
