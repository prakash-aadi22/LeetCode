import java.util.Scanner;

public class q_796_Rotate_String {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        return (s + s).contains(goal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the s: ");
        String s = sc.next();
        System.out.print("Enter the goal: ");
        String goal = sc.next();
        System.out.println(rotateString(s, goal));
    }
}
