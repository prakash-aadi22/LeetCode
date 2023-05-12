import java.util.Scanner;

public class q_389_Find_the_Difference {

    public static char findTheDifference(String s, String t) {
        int randomLetter = 0;
        for (char c : s.toCharArray()) {
            randomLetter -= c;
        }
        for (char c : t.toCharArray()) {
            randomLetter += c;
        }
        return (char) randomLetter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s = sc.next();
        System.out.print("Enter the second string: ");
        String t = sc.next();
        System.out.println(findTheDifference(s, t));
    }
}
