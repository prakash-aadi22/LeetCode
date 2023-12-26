import java.util.Scanner;

public class q_1678_Goal_Parser_Interpretation {
    public static String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the goal command: ");
        String str = sc.nextLine();
        System.out.println(interpret(str));
    }
}
