import java.util.Scanner;

public class q_65_Valid_Number {
    public static boolean isNumber(String s) {
        boolean digit = false;
        boolean e = false;
        boolean dot = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                digit = true;
            } else if (c == '+' || c == '-') {
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            } else if (c == 'E' || c == 'e') {
                if (e || !digit) return false;
                e = true;
                digit = false;
            } else if (c == '.') {
                if (e || dot) return false;
                dot = true;
            } else return false;
        }
        return digit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String str = sc.nextLine();
        System.out.println(isNumber(str));
    }
}
