import java.util.Scanner;

public class q_2278_Percentage_of_Letter_in_String {
    public static int percentageLetter(String s, char letter) {
        int countLetter = 0;
        for (char c : s.toCharArray()) {
            if (c == letter) {
                countLetter++;
            }
        }
        return (countLetter * 100) / s.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next();
        System.out.print("Enter the letter: ");
        char l = sc.next().charAt(0);
        System.out.println(percentageLetter(str, l));
    }
}
