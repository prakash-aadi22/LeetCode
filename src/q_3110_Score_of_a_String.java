import java.util.Scanner;

public class q_3110_Score_of_a_String {
    public static int scoreOfString(String s) {
        int total = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            total += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String str = sc.next();
        System.out.println(scoreOfString(str));
    }
}
