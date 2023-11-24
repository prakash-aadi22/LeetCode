import java.util.Scanner;

public class q_1816_Truncate_Sentence {
    public static String truncateSentence(String s, int k) {
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(str[i]).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of string: ");
        String s = sc.nextLine();
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        System.out.println(truncateSentence(s, k));
    }
}
