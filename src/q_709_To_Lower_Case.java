import java.util.Scanner;

public class q_709_To_Lower_Case {
    public static String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.next();
        System.out.println(toLowerCase(s));
    }
}
