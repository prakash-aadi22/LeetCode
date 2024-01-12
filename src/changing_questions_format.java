import java.util.Scanner;

public class changing_questions_format {

    public static String change(String input) {
        input = input.trim();
//        input = input.replace(" ", "_").replace(".", "").replace("-", "_");
        input = input.replace(".", "");
        input = input.replaceAll("[ !'?,-]", "_");
        return "q_" + input;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        String input = sc.nextLine(); // 1. Two Sum
        String className = change(input);
        System.out.println(className); // q_1_Two_Sum
    }
}
