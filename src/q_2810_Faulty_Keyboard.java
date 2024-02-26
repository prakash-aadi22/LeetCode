import java.util.Scanner;

public class q_2810_Faulty_Keyboard {
    public static String finalString(String s) {
        StringBuilder nm = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == 'i') {
                nm.reverse();
            } else {
                nm.append(c);
            }
        }
        return nm.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String input = sc.nextLine();
        System.out.println(finalString(input));
    }
}
