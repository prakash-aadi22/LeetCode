import java.util.Scanner;

public class q_1832_Check_if_the_Sentence_Is_Pangram {

    public static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        for (char i = 'a'; i <= 'z'; i++) {
            if (sentence.indexOf(i) < 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String str = sc.next();
        System.out.println(checkIfPangram(str));
    }
}
