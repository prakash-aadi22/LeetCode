import java.util.Scanner;

public class changing_questions_format {
    public static String change(String input) {
        input = input.trim();
        input = input.replaceAll("[.:]", "").replaceAll("[{()}]", "");
        input = input.replaceAll("[ !'?,-]", "_");
        return "q_" + input;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        String input = sc.nextLine(); // 1. Two Sum
        System.out.println(change(input)); // q_1_Two_Sum
    }
}
